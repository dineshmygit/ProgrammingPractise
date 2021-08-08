package week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class TwoSum {
	@Test
	public void test1() {
		int arr[]= {1,3,8,2,6};
		int target=10;
		int[] result= twoSumUsingTwoPointer(arr,target);
		System.out.println(Arrays.toString(result));
	}
	@Test
	public void test2() {
		int arr[]= {2,3,4,5,6};
		int target=100;
		int[] result= twoSumUsingTwoPointer(arr,target);
		System.out.println(Arrays.toString(result));
	}
	@Test
	public void test3() {
		int arr[]= {2,3,4,5,5,11};
		int target=10;
		int[] result= twoSumUsingTwoPointer(arr,target);
		System.out.println(Arrays.toString(result));
	}
	/* Time complexity:O(n)
	 * Space Complexity:O(n) 
	 * */
	private int[] twoSumUsingSinglePass(int[] arr, int target) {
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			int sub=target-arr[i];
			if(map.containsKey(sub)) {
				return new int[] {map.get(sub),i};
			}
			map.put(arr[i], i);
		}
		return new int[] {-1,-1};
	}

	/* Time complexity:O(n)
	 * Space Complexity:O(1) 
	 * */
	private int[] twoSumUsingTwoPointer(int[] arr, int target) {
		int left=0,right=arr.length-1;
		//Arrays.sort(arr);
		while(left<right) {
			if(arr[left]+arr[right]==target) {
				return new int[] {left,right};
			}else if(arr[left]+arr[right]<target) {
				left++;
			}else {
				right--;
			}
		}
		return new int[] {-1,-1};
	}
}
