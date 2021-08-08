package mypractise;

import java.util.Arrays;

import org.junit.Test;

public class BiggestCharacterInArray {
	@Test
	public void test1() {
		char[] data= {'b','d','h'};
		findBiggestChar(data);
		
	}

	private void findBiggestChar(char[] data) {
		int[] count=new int[26];
		for (int i = 0; i < data.length; i++) {
			count[data[i]]++;
		}
		//System.out.println(Arrays.toString(count));
	}

}
