package week2;

import org.junit.Test;

public class MaxNumberSlidingWindow {
	@Test
	public void test1() {
		int[] data= {2,4,6,2,1,11};
		int k=3;
		findMaxNumUsingSlidingWindow(data,k);
	}
	public void test2() {

	}
	
	private void findMaxNumUsingSlidingWindow(int[] data, int k) {
		int windowSum=0,maxSum=0;
		for (int i = 0; i < k; i++) {
			windowSum+=data[i];
		}
		maxSum=windowSum;
		for (int i = 1; i < data.length-k; i++) {
			windowSum+=data[i+k-1]-data[i-1];
			//windowSum=windowSum+data[i+k-1]-data[i-1]
			maxSum=Math.max(windowSum, maxSum);
		}
	}
}
