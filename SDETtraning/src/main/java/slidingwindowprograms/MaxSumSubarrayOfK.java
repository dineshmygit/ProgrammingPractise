package slidingwindowprograms;

import org.junit.Test;

import junit.framework.Assert;

public class MaxSumSubarrayOfK {

	/*Comments*/
	@Test
	public void test1() {
		int[] arr= {4,2,1,7,8,1,2,8,1,0};
		int k=3;
		Assert.assertEquals(findMaxSum(arr,k), 16);
	}

	private int findMaxSum(int[] arr, int k) {
		int maxSum=Integer.MIN_VALUE,currentSum=0;
		for (int i = 0; i < arr.length; i++) {
			currentSum+=arr[i];
			if(i>=k-1) {
				maxSum=Math.max(maxSum, currentSum);
				currentSum-=arr[i- (k-1)];
			}
		}
		return maxSum;
	}
}
