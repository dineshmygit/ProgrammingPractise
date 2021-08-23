package week5;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SquareRoot {
	@Test
	public void test1() {
		int[] data= {4,5,6};
	//	{-2,1,4,5}
       		Assert.assertEquals(findSquareRoot(data), new int[] {16,25,36});	
	}

	private int[] findSquareRoot(int[] data) {
		int[] arr=new int[data.length];
		for (int i = 0; i < data.length; i++) {
			arr[i]=data[i]*data[i];
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
