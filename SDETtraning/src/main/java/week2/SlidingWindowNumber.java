package week2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

/*Example 1:
    Input: nums = [1,2,3,1], k = 3
    Output: true
    Example 2:
    Input: nums = [1,0,1,1], k = 1
    Output: true
    Example 3:
    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false
    Example 3:
    Input: nums = [1,2,3,2,2,3], k = 2
    Output: true

    1.Iterate through array till k
    2.Add values in a set
    3.while set add is false , then return true
    4.if true -> remove first value and add last value
    5.if duplicated return true
 *
 */



public class SlidingWindowNumber {



	//@Test
	public void test1() {
		int[] arr= {1,2,3,1};
		int k=3;
		
		Assert.assertEquals(true, duplicateCheck(arr,k));

	}

	//@Test
	public void test2() {
		int[] arr= {1,0,1,1};
		int k=2;
		Assert.assertEquals(true, duplicateCheck(arr,k));
	}

	//@Test
	public void test3() {
		int[] arr= {1,2,3,1,2,3};
		int k=2;
		Assert.assertEquals(false, duplicateCheck(arr,k));
	}
	@Test
	public void test4() {
		int[] arr= {8,5,4,1,8,3,8};
		int k=3;
		Assert.assertEquals(true, duplicateCheck(arr,k));
	}
	//[1,0,1,1]
	private boolean duplicateCheck(int[] arr, int k) {
		Set<Integer> value=new HashSet<Integer>(); 
		for (int i = 0; i <= k; i++) {
			if(!value.add(arr[i]))
				return true;
		}
		for (int i = k+1; i < arr.length; i++) {
			value.remove(arr[i-1-k]);
			if(!value.add(arr[i]))
				return true;
		}
		return false;
	}
}
