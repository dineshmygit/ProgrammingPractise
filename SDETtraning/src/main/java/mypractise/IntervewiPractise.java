package mypractise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class IntervewiPractise {
	@Test
	public void test1() {
		int[] data= {3,4,-1,2,-3};
		movePositiveToRight(data);
	}

	private void movePositiveToRight(int[] data) {
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
	}
	private void movePositiveToRightList(int[] data) {
		List<Integer>ls=new LinkedList<Integer>();
		System.out.println(Arrays.toString(data));
	}

}
