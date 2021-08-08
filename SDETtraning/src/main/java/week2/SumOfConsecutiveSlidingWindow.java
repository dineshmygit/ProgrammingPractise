package week2;

import org.junit.Test;

public class SumOfConsecutiveSlidingWindow {
	@Test
	public void test1() {
		int[] arr= {1,5,2,3,7,1};
		int target=3;
		findingSum(arr,target);

	}

	public void findingSum(int[] arr,int target) {
		int initSum=0,maxSum=0;
		for (int i = 0; i < target; i++) {
			initSum+=arr[i];
		}
		maxSum=initSum;
		for (int i = 1; i <= arr.length-target; i++) {
			initSum+=arr[i+target-1]-arr[i-1];
			maxSum=Math.max(maxSum, initSum);
		}

	}

}
