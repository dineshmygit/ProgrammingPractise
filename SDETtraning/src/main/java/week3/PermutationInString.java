package week3;
/*
1. Understand the problem  : yes
2. Test data set
  	input:String => s1="ab" s2 = "eidbaooo"
  	Target:
  	output:True 
3. Do you know how to solve
4. Ask for hints and constraints:
   Solve in brute force  
5. Alternative solution
   two pointer or sliding window  
6. Know O notation
   O(n^2)
7. write Pseudo code
	1.
 
 */

import java.util.ArrayDeque;

import org.junit.Test;

public class PermutationInString {
	@Test
	public void test1() {
     String str="dinesh";
     findPermutationSubstring(str);
	}
	private void findPermutationSubstring(String str) {
      str.contains("din");		
      ArrayDeque<Character> arr= new ArrayDeque<Character>();
	}
	
}
