import com.google.common.base.CharMatcher;

public class CharMatcherTester {

	public static void main(String[] args) {
			
			// displays only digits from string
		  	System.out.println(CharMatcher.DIGIT.retainFrom("mahesh123"));    
		  	// trim whitespace at ends, and replace/collapse whitespace into single spaces
		  	System.out.println(CharMatcher.WHITESPACE.trimAndCollapseFrom("     Mahesh     Parashar ", ' '));
		    // star out all digits
	       	System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom("mahesh123", "*"));	
	       	// eliminate all characters that aren't digits or lowercase
	       	System.out.println(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom("JJJJmaheshaaa123"));
	       	// displays only letters from string
	       	System.out.println(CharMatcher.JAVA_LETTER.retainFrom("mahesh123"));
	   }
	}

