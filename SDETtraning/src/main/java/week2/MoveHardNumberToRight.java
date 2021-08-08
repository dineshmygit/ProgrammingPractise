package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*yes
 * TestData:{1,2,3,4,5}
 * output:{2,4,1,3,5};
 * 
 * Any constraint:
 * 
 * Approaches:
 *1.Brute Force
 *2.Using List 
 * 
 * Return an array
 * 
 * Iterate through array
 * check number is equal to 0 by using mod
 * push the even to list and odd to list and merger the list
 * covert the list values to array
 * return the list
 * 
 * */

public class MoveHardNumberToRight {

	@Test
	public void test1() {
		int[] arr= {1,2,3,4,5};
		moveHardNumberTwoPointer(arr);
		//Assert.assertTrue(Arrays.equals(moveHardNumber2(arr), new int[] {2,4,1,3,5}));
	}
	//@Test
	public void test2() {
		int[] arr= {2,2,2,2,2};
		Assert.assertTrue(Arrays.equals(moveHardNumber1(arr), new int[] {2,2,2,2,2}));
	}
	//@Test
	public void test3() {
		int[] arr= {};
		Assert.assertTrue(Arrays.equals(moveHardNumber1(arr), new int[] {}));
	}

	/*
	 * Time complexity:O(4n)=>O(n) 
	 * Space COmplexity:O(n)
	 */
	public int[] moveHardNumber1(int[] arr) {
		List<Integer>ls1=new ArrayList<Integer>();
		List<Integer>ls2=new ArrayList<Integer>();
		List<Integer>ls3=new ArrayList<Integer>();
		int[] result=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				ls1.add(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				ls2.add(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			ls3.addAll(ls1);
			ls3.addAll(ls2);
		}
		for (int i = 0; i < arr.length; i++) {
			result[i]=ls3.get(i);
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
	
	public void moveHardNumberTwoPointer(int[] arr) {
		int left=0;int right =1,tmp=0;
		Arrays.sort(arr);
		while(arr.length>right) {
			if(arr[left]%2!=0 && arr[right]%2==0) {
				tmp=arr[left];
				arr[left++]=arr[right];
				arr[right++]=tmp;
			}else if(arr[left]%2==0 && arr[right]%2!=0) {
				left++;
				right++;
			}else {
				
			}
		}
		System.out.println(Arrays.toString(arr));
		//return arr;
	}
}
