import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class MultiSetTester {

	public static void main(String[] args) {
		
		Multiset<String> multiset = HashMultiset.create();
		multiset.add("a");
	    multiset.add("b");
	    multiset.add("c");
	    multiset.add("d");
	    multiset.add("a");
	    multiset.add("b");
	    multiset.add("c");
	    multiset.add("b");
	    multiset.add("b");
	    multiset.add("b");
	    
	    System.out.println(multiset);
	    //print total number of elements
	    System.out.println("Size of multiset : "+multiset.size());
	    //print total occurance of b
	    System.out.println("Occurance of b : "+multiset.count("b"));
	    //print distinct elements of multiset
	    System.out.println("get distinct elements of multiset : "+multiset.elementSet());
	    
	    System.out.println("Multiset values and occurrences : ");
	    for (Multiset.Entry<String> entry : multiset.entrySet()) {
	         System.out.println("Element: " + entry.getElement() + ", Occurrence(s): " + entry.getCount());
	    }
	
	    //remove extra occurrences
	    multiset.remove("b",2);
	      
	   //print the occurrence of an element
	    System.out.println("Occurence of 'b' after removal : " + multiset.count("b"));
	}
}
