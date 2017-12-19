import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.common.collect.Ordering;

public class GuavaOrdering {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
	      
	      numbers.add(new Integer(5));
	      numbers.add(new Integer(2));
	      numbers.add(new Integer(15));
	      numbers.add(new Integer(51));
	      numbers.add(new Integer(53));
	      numbers.add(new Integer(35));
	      numbers.add(new Integer(45));
	      numbers.add(new Integer(32));
	      numbers.add(new Integer(43));
	      numbers.add(new Integer(16));

	      @SuppressWarnings("rawtypes")
	      //returns a serializable ordering that uses the natural order of the values.
		  Ordering ordering = Ordering.natural();
	      System.out.println("Input List: ");
	      System.out.println("1 : "+numbers);		
	         
	      Collections.sort(numbers,ordering );
	      System.out.println("Sorted List: ");
	      System.out.println(numbers);
	         
	      //isOrdered()-returns boolean value as ordering is applied or not
	      System.out.println("List is sorted: " + ordering.isOrdered(numbers));
	      //returns minimum valued element
	      System.out.println("Minimum: " + ordering.min(numbers));
	      //returns maximum valued element
	      System.out.println("Maximum: " + ordering.max(numbers));
	      //sorting in descending order   
	      Collections.sort(numbers,ordering.reverse());
	      System.out.println("Reverse: " + numbers);

	      numbers.add(null);
	      System.out.println("Null added to Sorted List: ");
	      System.out.println(numbers);		
	      //returns an array in which null will be on first position in array
	      Collections.sort(numbers,ordering.nullsFirst());
	      System.out.println("Null first Sorted List: ");
	      System.out.println(numbers);
	      
	      //method chaining with ordering
	      Collections.sort(numbers, ordering.nullsFirst().reverse());
	      System.out.println("ordering2.nullsFirst().reverse() : "+numbers);
	      
	      List<String> names = new ArrayList<String>();
	      
	      names.add("Ram");
	      names.add("Shyam");
	      names.add("Mohan");
	      names.add("Sohan");
	      names.add("Ramesh");
	      names.add(null);
	      names.add("Suresh");
	      names.add("Naresh");
	      names.add("Mahesh");
	      names.add("Vikas");
	      names.add("Deepak");
	      
	      System.out.println("Another List: ");
	      System.out.println(names);
	      //method chaining with ordering
	      Collections.sort(names, ordering.nullsFirst().reverse());
	      System.out.println("ordering2.nullsFirst().reverse() : "+names);
	}
}

