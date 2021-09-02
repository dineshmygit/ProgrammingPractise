package slidingwindowprograms;

import org.junit.Test;

public class SmallestSumInArray {
	/*Comments*/
	@Test
	public void test1() {
		int[] arr = {3, -4, 2, -3, -1, 7, -5};
		findSmallestSubarrayKA(arr);
	}
	@Test
	public void test2() {
		int[] arr = {2, 6, 8, 1, 4};
		findSmallestSubarrayKA(arr);
	}

	private void findSmallestSubarray(int[] arr) {
		int currentSum=0,minSum=0;
		for (int i = 0; i < arr.length; i++) {
			currentSum=currentSum+arr[i];
			if(currentSum<0) {
				minSum=Math.min(minSum, currentSum);
			}else {
				currentSum=0;
			}
		}
		System.out.println(minSum);
	}
	//3, -4, 2, -3, -1, 7, -5
	private void findSmallestSubarrayKA(int[] arr) {
		int currentSum=arr[0],minSum=arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentSum=Math.min(arr[i], currentSum+arr[i]);
			minSum=Math.min(minSum, currentSum);
		}
		System.out.println(minSum);
	}
}
