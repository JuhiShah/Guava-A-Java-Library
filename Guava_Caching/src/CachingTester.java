import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CachingTester {

	static Employee e1 = new Employee(1, "zenna", "101e");
	static Employee e2	= new Employee(2, "shishir", "102e");
	static Employee e3 = new Employee(3, "moti", "103e");
	
	public static void main(String[] args) {
		
		 //create a cache for employees based on their employee id
		LoadingCache<Integer, Employee> loadingCache = CacheBuilder.newBuilder()
				.maximumSize(4)									//maximum 4 records can be cached 
				.expireAfterAccess(50, TimeUnit.MINUTES)	    //cache will expire after 5 minutes 
				.build(new CacheLoader<Integer, Employee>(){	//build the cache loader

					@Override
					public Employee load(Integer id) throws Exception {
						return getEmployeeById(id);
					}
		});
		try{
			//on first invocation, cache will be populated with corresponding employee record
			System.out.println("First call of employee data : ");
			System.out.println(loadingCache.get(1));
			System.out.println(loadingCache.get(2));
			System.out.println(loadingCache.get(3));
			
			//populate cache using put method
			loadingCache.put(4, new Employee(4, "sajjan", "104e"));
			System.out.println(loadingCache.get(4));
			
			System.out.println();
			
			//second invocation, data will be returned from cache
			System.out.println("Second call of employee data : ");
			System.out.println(loadingCache.get(3));
			System.out.println(loadingCache.get(2));
			System.out.println(loadingCache.get(1));
			System.out.println(loadingCache.get(4));
			 System.out.println();
			//invalidate all cached data, we can also invalidate using single key, multiple keys.
			loadingCache.invalidateAll();
			
			System.out.println("Third call of employee data after invalidating cache data : ");
			System.out.println(loadingCache.get(3));
			System.out.println(loadingCache.get(2));
			System.out.println(loadingCache.get(1));

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static Employee getEmployeeById(Integer id) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		
		System.out.println("Employee obj loaded in guava cache of id : "+id);
		return map.get(id);
	}
}