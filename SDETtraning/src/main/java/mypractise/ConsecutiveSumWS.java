package mypractise;

import org.junit.Test;

public class ConsecutiveSumWS {
	@Test
	public void test1() {
		// TODO Auto-generated method stub

	int[] data= {1,2,3,4,5,6,7,8,9,10};
	int k=5;
	int sum=findConsecutiveNum(data,k);
	}

	private int findConsecutiveNum(int[] data, int k) {
		int windowSum=0,maxSum=0;
		for (int i = 0; i < k; i++) 
		windowSum+=data[i];
		maxSum=windowSum;
		for (int i = 1; i <= data.length-k; i++) {
			windowSum=windowSum-data[i-1]+data[i+k-1];
			maxSum=Math.max(maxSum, windowSum);
		}
		System.out.println(maxSum);
		return maxSum;
	}
}
