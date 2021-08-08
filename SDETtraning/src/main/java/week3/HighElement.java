package week3;

import org.junit.Test;

import junit.framework.Assert;

public class HighElement {
	@Test
	public void test1() {
		int[] data= {1,-5,2,-3,7,1};
		int result=findingHighestSumUsingSliding(data);
	}
	@Test
	public void test2() {
		int[] data= {0,0,0,0,0};
		int result=findingHighestSumUsingSliding(data);
	}
	@Test
	public void test3() {
		int[] data= {1,1,1,1,1};
		int result=findingHighestSumUsingSliding(data);
	}
	@Test
	public void test4() {
		int[] data= {100,200,300,400};
		int result=findingHighestSumUsingSliding(data);
	}
	
	private int findingHighestSumUsingSliding(int[] data) {
		int sum=0,maximum=0;
		for (int i = 0; i < data.length; i++) {
			sum=0;
			for (int j = i; j < data.length; j++) {
				sum+=data[j];
			maximum=Math.max(sum, maximum);
			}
		}
		System.out.println(maximum);
		return maximum;
	}
}
