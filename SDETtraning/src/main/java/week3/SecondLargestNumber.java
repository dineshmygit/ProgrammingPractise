package week3;

import org.junit.Test;

public class SecondLargestNumber {
	@Test
	public void test1() {
		int[] arr= {1,2,3,4};
		findSecondLargestNumber(arr);
	}

	private void findSecondLargestNumber(int[] arr) {
		int maxValue=0,secondValue=0;
		for (int i = 0; i < arr.length; i++) {
			maxValue=Math.max(maxValue, arr[i]);
		}
		System.out.println(secondValue);
		
	}

}
