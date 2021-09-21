package leetcode2pointer;

import org.junit.Test;

public class ImplementStrStr {
	
	/*Comments*/
	@Test
	public void test1() {
		String haystack="hello";
		String needle="ll";
		int result=findFirstOccurance(haystack,needle);
	}    

	private int findFirstOccurance(String haystack, String needle) {
		/*IndexOf function will by default is empty will return 0
		 *If char is not present it will by default return -1
		 * and it will return the first index if found
		 * */
		int result=haystack.indexOf(needle);
		return result;
	}

}
