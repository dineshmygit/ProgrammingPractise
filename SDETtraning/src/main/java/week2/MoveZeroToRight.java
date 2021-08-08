package week2;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroToRight {

	@Test
	public void test1() {
		int[] data= {3,0,4,5,2,0,1,0,0};
		int[] result=moveZeroRightSinlePass(data);
		System.out.println(Arrays.toString(result));
	}
	//@Test
	public void test2() {

	}
	//@Test
	public void test3() {

	}

	private int[] moveZeroRightSinlePass(int[] data) {
		int[] newData=new int[data.length];
		int j=0;
		for (int i = 0; i < newData.length; i++) {
			if(data[i]!=0) {
				newData[j++]=data[i];
			}
		}
		return newData;
	}

}
