package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FactorOfNumbers {
	/*Comments*/
	//@Test
	public void test1() {
		int[] data= {3,6,7};
		int k=3;
		int factor=2;
		findFactor(data,k,factor);
	}
	@Test
	public void test2() {

	}
	@Test
	public void test3() {
		int[] data= {1000};
		int k=3;
		int factor=2;
		findFactor(data,k,factor);
	}
	private int findFactor(int[] data, int k,int factor) {
		int result=0;
		List<Integer> ls=new ArrayList<Integer>();
		int[] resultArr=new int[data.length];
		for (int i = 0; i < data.length; i++) {
			if(data[i]%k==0) {
				ls.add(data[i]);
			}
		}
		//Arrays.f
		System.out.println(ls.get(factor-1));
		return ls.get(factor-1);
	}
}
