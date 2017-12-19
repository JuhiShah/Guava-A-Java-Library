import java.util.Arrays;
import com.google.common.base.Joiner;

public class JoinerTester {

	public static void main(String args[]) {
	    System.out.println(Joiner.on(",").skipNulls().join(Arrays.asList(1,2,3,4,5,null,6)));
	    String string[] = {"A","B","C", "D", null, "a"};
	    System.out.println(Joiner.on(",").useForNull("NULL").join(string));
	   }
}
 