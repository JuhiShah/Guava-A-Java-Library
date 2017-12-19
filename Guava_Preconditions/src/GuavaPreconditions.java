import com.google.common.base.Preconditions;

public class GuavaPreconditions {

	public static void main(String[] args) {
		
		GuavaPreconditions guavaPreconditions = new GuavaPreconditions();
		
		try{
			Integer sum = guavaPreconditions.sum(10, null);
			System.out.println("sum : "+sum);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try{
			Double sqrt = guavaPreconditions.squareRoot(12.5f);
			System.out.println("sqrt : "+sqrt);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try{
			Integer val = guavaPreconditions.getValue(6);
			System.out.println("value : "+val);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			Integer val = guavaPreconditions.getPosition(5);
			System.out.println("position : "+val);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}
	
	public Integer sum(Integer a, Integer b){
		Preconditions.checkNotNull(a,"first value is null");
		Preconditions.checkNotNull(b, "Second value is null");
		return a+b;
	}
	
	public Double squareRoot(Float a){
		Preconditions.checkArgument(a>0, "input value %s is negative", a);
		return Math.sqrt(a);
	}
	
	public Integer getValue(Integer a){
		Integer data[] = {61, 62, 63, null, 65};
		int index = Preconditions.checkElementIndex(a, data.length);
		System.out.println("data[index] element : "+data[index]);
		return Preconditions.checkElementIndex(a, data.length);
	}
	
	public Integer getPosition(Integer a){
		Integer data[] = {61, 62, 63, null, 65};
		int index = Preconditions.checkPositionIndex(a,data.length);
		System.out.println("data[index] position : "+data[index]);
		return Preconditions.checkPositionIndex(a,data.length);
	}
	
}
