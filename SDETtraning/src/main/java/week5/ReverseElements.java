package week5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class ReverseElements {
	@Test
	public void test1() {
		int[] data= {1,2,3,4,5};
		int k=2;
		//output:{2,1,3,4,5}
		System.out.println(Arrays.toString(reverseGivenElements(data,k)));
	}
	@Test
	public void test2() {
		int[] data= {2,4,6,8,10};
		int k=3;
		//output:{2,1,3,4,5}
		System.out.println(Arrays.toString(reverseGivenElements(data,k)));
	}

	private int[] reverseGivenElements(int[] data, int k) {
		Stack<Integer> stack=new Stack<Integer>();
		ArrayDeque<Integer>queue=new ArrayDeque<Integer>();
		int[] resultArray=new int[data.length];
		for (int i = 0; i < k; i++) {
			stack.push(data[i]);
		}
		for (int i = 0; i < k; i++) {
			queue.offer(stack.pop());
		}
		for (int i = k; i < data.length; i++) {
			queue.offer(data[i]);
		}
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i]=queue.poll();
		}
		return resultArray;
	}

}
