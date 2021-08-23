package week5;

import java.util.Arrays;

import org.junit.Test;

public class MinimumSumInArray {
	/*Comments*/
	@Test
	public void test1() {
		int[] data= {4,6,11,3,0,2};
		int k=3;
		findMiniminSum(data,k);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {
		int[] data= {4,6,11,3,0,2};
		int k=3;
		findMiniminSum(data,k);
	}

	private void findMiniminSum(int[] data, int k) {
		int left=0,right=0,min=0,minimumSum=0,result=0;
		for (int i = 0; i < k; i++) {
			min+=data[i];
		}
		minimumSum=min;
		int i=0;
		while(i<data.length-k) {
			for ( i = 1; i < data.length-k; i++) {
				min=min-data[i-1]+data[i+k-1];
				minimumSum=Math.min(minimumSum, min);
				result=minimumSum;
				if(result<=minimumSum) {
					Arrays.copyOfRange(data, i, i+k);
				}
			}
		}
		//star technique explain in this way
		//
		System.out.println(Arrays.toString(Arrays.copyOfRange(data, i, i+k)));
	}
}
//backward compatibility interface 1.8
//    