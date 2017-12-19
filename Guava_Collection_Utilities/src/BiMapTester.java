import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BiMapTester {

	public static void main(String[] args) {
		
		      BiMap<Integer, String> empIDNameMap = HashBiMap.create();

		      empIDNameMap.put(101, "Mahesh");
		      empIDNameMap.put(102, "Sohan");
		      empIDNameMap.put(103, "Ramesh");
		      
		      System.out.println(empIDNameMap);
		      //Emp Id of Employee "Mahesh"
		      System.out.println(empIDNameMap.inverse().get("Mahesh"));
		      System.out.println(empIDNameMap.values());
		    
		      //alternate way of 'put()'
		       empIDNameMap.forcePut(101, "Sidhhesh");
		    
		      System.out.println(empIDNameMap);
		}	
}