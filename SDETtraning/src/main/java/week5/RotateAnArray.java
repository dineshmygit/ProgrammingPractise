package week5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class RotateAnArray {
	/*Comments*/
	@Test
	public void test1() {
		int[] data= {0,1,2,4,5,6,7};
		int rot=3;
		int target=4;
		int index=findTargetAfterRotateDequeue(data,rot,target);
		System.out.println(index);
	}

	@Test
	public void test2() {
		int[] data= {0,1,2,4,5,6,7};
		int rot=3;
		int target=3;
		int index=findTargetAfterRotateDequeue(data,rot,target);
		System.out.println(index);
	}

	@Test
	public void test3() {
		int[] data= {0,1,2,4,5,6,7};
		int rot=3;
		int target=0;
		int index=findTargetAfterRotateDequeue(data,rot,target);
		System.out.println(index);
	}

	private int findTargetAfterRotate(int[] data, int rot, int target) {
		reverse(data,0,data.length-1);
		reverse(data,0,rot);
		int[] result=reverse(data,rot+1,data.length-1);
		for (int i = 0; i < result.length; i++) {
			if(result[i]==target) return i;
		}
		return 0;
	}
	private int[] reverse(int[] data,int start,int end) {
		int tmp=0;
		while(start<end) {
			tmp=data[end];
			data[end]=data[start];
			data[start]=tmp;
			start++;
			end--;
		}
		return data;
	}
	private int findTargetAfterRotateDequeue(int[] data, int rot, int target) {
		ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
		ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		for (int i = 0; i < rot; i++) {
			stack.push(data[i]);
		}
		System.out.println(stack);
		for (int i = rot; i < data.length; i++) {
			queue.offer(data[i]);
		}
		for (int i = 0; i < rot; i++) {
			queue.offer(stack.removeLast());
		}
		
		for (int i = 0; i < data.length; i++) {
			data[i]=queue.poll();
			if(data[i]==target) {
				return i;
			}
		}
		System.out.println(Arrays.toString(data));
		return -1;
	}
}
