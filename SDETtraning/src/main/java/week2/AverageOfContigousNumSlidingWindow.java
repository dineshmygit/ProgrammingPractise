package week2;

import org.junit.Test;

public class AverageOfContigousNumSlidingWindow {

	@Test
	public void test1() {
		averageCalculation();
	}
	
	public void averageCalculation() {
		int[] num= {1,12,-5,-6,50,3};
		double output=12.75;
		int k=4;
		int sum=0,toFindAverage=0;
		for (int i = 0; i < k; i++) {
			sum+=num[i];
		}
	}
}
