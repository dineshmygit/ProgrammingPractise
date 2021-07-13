package week1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr. 
 * If there are duplicates in arr, count them separately.
1. Understand the problem
  Find the next num of a num present in int array and retrun the value
2. Test data set
  	input:{1,2,2,3}
  	Target:
  	output:3
3. Do you know how to solve
   Yes
4. Ask for hints and constraints
   
5. Alternative solution
   a)Brute force -O(n^2)
   b)using Set and comparing array    
6. Know O notation => O(n)
7. write Pseudo code
1.Traverse through the array
   2.Add the array to set to remove duplicates
   3.compare the value in set = array[i]+1
   4.If true add the count
   5.if not continue
   6.Get the count and return 
8. Implement the code
9. Debug and Test
 */
public class NextNumPresent {

	@Test
	public void positiveCase() {
		int[] arr= {1,2,3};
		funCal(arr);
		Assert.assertEquals(funCal(arr), 2);
	}

	@Test
	public void negativeCase() {
		int[] arr= {1,1,3,3,5,5,7,7};
		//funCal(arr);
		Assert.assertEquals(funCal(arr), 0);
	}

	@Test
	public void edgeCase() {
		int[] arr= {1,1,2,2};
		//funCal(arr);
		Assert.assertEquals(funCal(arr), 2);
	}

	/*
	 * Time complexity:O(2n)=> O(n) 
	 * Space complexity :O(n)=> O(1)Try it
	 */
	//Change method name countingElements
	//Change cases method name 
	//think other data set
	private int funCal(int[] arr) {

		Set<Integer> set=new HashSet<Integer>();
		int count=0;
		for (int i = 0; i < arr.length; i++) {//O(n)
				set.add(arr[i]);
		}
		for (int j = 0; j < arr.length; j++) {//O(n)
			if(set.contains(arr[j]+1)) {
				count++;
			}	
		}
		return count;
	}
}
