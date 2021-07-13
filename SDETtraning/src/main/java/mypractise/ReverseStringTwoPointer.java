package mypractise;

import org.junit.Test;

public class ReverseStringTwoPointer {

	@Test
	public void test1() {
		String str= "hello";
		reverserString(str);
	}

	public void reverserString(String str) {
		char[] arr=str.toCharArray();
		int left=0,right=arr.length-1;
        char tmp;
		while(left!=right) {
			tmp=arr[left];
			arr[left++]=arr[right];
			arr[right--]=tmp;
		}
		System.out.println(arr);
	}
}
