package slidingwindowprograms;

import org.junit.Test;

import junit.framework.Assert;

public class SmallestSubarrayInGivenTarget {

	@Test
	public void test1() {
		int[] arr= {4,2,2,7,8,1,2,8,10};
		int targetSum=8;
		Assert.assertEquals(findSmallestSubarray(arr,targetSum),1);
	}

	private int findSmallestSubarray(int[] arr, int targetSum) {
		int currentSum=0;
		int minWindowsize=Integer.MAX_VALUE;
		int currentWindowSize=0;
		int windowStart=0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			currentSum+=arr[windowEnd];
			while(currentSum>=targetSum) {
				minWindowsize = Math.min(windowEnd-windowStart+1, minWindowsize)	;
				currentSum-=arr[windowStart];
				windowStart++;
			}
		}
		return minWindowsize;
	}

}
