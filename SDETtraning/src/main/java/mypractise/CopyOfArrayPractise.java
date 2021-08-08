package mypractise;

import java.util.Arrays;

import org.junit.Test;

public class CopyOfArrayPractise {
	
	/*Comments*/
	@Test
	public void test1() {
		int[] arr= {1,2,3,4,5};
		findingNumber(arr);
	}

	private void findingNumber(int[] arr) {
		
		int[] output=Arrays.copyOf(arr, 1);
		int[] range=Arrays.copyOfRange(arr,0,3);
		System.out.println(output.length);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(output));
		System.out.println(Arrays.toString(range));
		
	}

}
