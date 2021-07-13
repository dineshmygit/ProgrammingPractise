package mypractise;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumTwopointer {
	@Test
	public void test1() {
		int[] arr= {1,4,5,8,11,12,16,21};
		int target=19;
		int[] result=addtwoSum(arr,target);
		//System.out.println(Arrays.toString(result));
		assertArrayEquals(new int[] {3,4}, result);
	}
	
	@Test
	public void test2() {
		int[] arr= {1,4,5,8,11,12,16,21};
		int target=99;
		int[] result=addtwoSum(arr,target);
		//System.out.println(Arrays.toString(result));
		assertArrayEquals(new int[] {-1,-1}, result);
	}
	
	@Test
	public void test3() {
		int[] arr= {2,3,4,5,5,11};
		int target=10;
		int[] result=addtwoSum(arr,target);
		//System.out.println(Arrays.toString(result));
		assertArrayEquals(new int[] {3,4}, result);
	}
	@Test
	public void test4() {
		int[] arr= {2,3,4,5,11};
		int target=10;
		int[] result=addtwoSum(arr,target);
		//System.out.println(Arrays.toString(result));
		assertArrayEquals(new int[] {-1,-1}, result);
	}

	/*
	 * Opposite direction two pointer approach
	 * Time complexity:O(n)
	 * Space Complexity:O(1)
	 */
	public int[] addtwoSum(int[] arr,int target) {
		int left=0,right=arr.length-1;
		while(right>left) {
			if(arr[left]+arr[right]==target) {
				return new int[] {left, right};
			}else if(arr[left]+arr[right]>target) {
				right--;
			}else {
				left++;
			}
		}
		return new int[] {-1,-1};
	}
}
