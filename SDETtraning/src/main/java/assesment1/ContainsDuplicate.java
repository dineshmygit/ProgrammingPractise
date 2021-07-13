package assesment1;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

/*
1. Understand the problem Yes
2. Test data set
  	input:{1,2,3,1}
  	Target:remove duplicates
  	output:true
3. Do you know how to solve
   yes
4. Ask for hints and constraints
   No constrain
5. Alternative solution
   yes -> Brute force O(n^2)
   using Set O(n)
   
6. Know O notation
   Using set:
   time complexity:O(n)
   space complexity : O(n)  
7. write Pseudo code
 1.Iterate through array
 2.add it to set 
 3.if value is not present add it 
 4. if value is already present in set return true
 5.if distint return false
8. Implement the code
9. Debug and Test
 */
public class ContainsDuplicate {


	@Test
	public void test1() {
		int[] arr= {1,2,3,1};
		Assert.assertEquals(true, findDuplicates(arr));
	}

	@Test
	public void test2() {
		int[] arr= {1,2,3,4};
		Assert.assertEquals(false, findDuplicates(arr));
	}

	//@Test
	public void test3() {
		int[] arr= {1,1,1,3,3,4,3,2,4,2};
		Assert.assertEquals(true, findDuplicates(arr));
	}

	/* time complexity :O(n)
	 * Space complexity:O(n)
	 * */
	private boolean findDuplicates(int[] arr) {
		Set<Integer> value=new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {	
			if(!value.add(arr[i])) {
				return true;
			}
		} 
		return false;
	}
}
