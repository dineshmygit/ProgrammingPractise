package week2;

import org.junit.Test;

public class AverageOfContigousNumSlidingWindow {

	//@Test
	public void test1() {
		int[] data= {1,12,-5,-6,50,3};
		int k=4;
		double output=12.75;
		maxAverageCalculation(data,output,k);
		System.out.println();
	}
	//@Test
	public void test2() {
		int[] data= {0,1,1,3,3};
		int k=4;
		double output=1.25000;
		maxAverageCalculation(data,output,k);
	}
	@Test
	public void test3() {
		int[] data= {7,4,5,8,8,3,9,8,7,6};
		int k=7;
		double output=7.00000;
		maxAverageCalculation(data,output,k);
	}

	/* Time complexity:O(n)
	 * SPace Complexity:O(n)
	 * 
	 * Iterate through array
	 * add sum of k and store in variable
	 * divide by k and find first Average 
	 * then iterate through other vales
	 * using sliding window remove first and add last
	 * add the sum and divide by k and get the Average
	 * compare the two Average return the max Average
	 * */
	public double maxAverageCalculation(int[] data,double output,int k) {
		double windowAvg=0, maxAvg=0;
		for (int i = 0; i < k; i++) {
			windowAvg+=data[i];
		}
		maxAvg=windowAvg/k;
		for (int i = 1; i <= data.length-k; i++) {
			windowAvg+=data[i+k-1]-data[i-1];
			windowAvg=windowAvg/k;
			maxAvg=Math.max(maxAvg, windowAvg);
		}
		System.out.println(maxAvg);
		return maxAvg;
	}
}
