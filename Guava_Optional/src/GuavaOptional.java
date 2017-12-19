import com.google.common.base.Optional;

public class GuavaOptional {

	//static final Optional absent = Optional.absent();
	public static void main(String[] args) {
		
		Integer v1 = null;
		Integer v2 = new Integer(10); 
		
		//Optional.fromNullable - allows passed parameter to be null.
		Optional<Integer> optional1 = Optional.fromNullable(v1);
		
		//Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> optional2 = Optional.of(v2);
		
		Integer sum = new GuavaOptional().sum(optional1, optional2);
		System.out.println("sum : "+sum);
		
	}

	public Integer sum(Optional<Integer> optional1, Optional<Integer> optional2) {
			
		//Optional.isPresent - checks the value is present or not
		System.out.println("value in option1 is present : "+optional1.isPresent());
		System.out.println("value in option2 is present : "+optional2.isPresent());
		
		//Returns a hash code for this instance.
		System.out.println("hashcode of option1 : "+optional1.hashCode());
		System.out.println("hashcode of option2 : "+optional2.hashCode());
		
		//Optional.orNull - returns the contained instance value if it is present; otherwise returns null
		System.out.println(optional1.orNull());
		
		//Optional.or - returns the value if present otherwise returns /the default value passed.
		Integer a = optional1.or(new Integer(0));
		
		//Optional.get - gets the value, value should be present
		Integer b = optional2.get();
		Integer sum = a+b;
		
		//System.out.println(new MainClass().absent);
		
		return sum;
	}
}
