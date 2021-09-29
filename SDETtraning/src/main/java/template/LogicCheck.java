package template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LogicCheck {

	//	@Test
	public void calculation() {
		int[] arr= {1,1,1,1,1};
		int[] arr1=new int[arr.length];
		int count=0;
		Arrays.sort(arr);
		//{1,2,2,3,8}
		for (int i = arr.length-1; i >0; i--) {
			if(arr[i]>arr[i-1]) {
				count=i;
			}else {
				count=i-1;
			}
			arr1[i]=count;
		}
		System.out.println(Arrays.toString(arr1));

	}
	//@Test
	public void calculation1() {
		int[] arr= {8,1,2,2,3};
		Set<Integer> set=new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int j = 0; j < arr.length; j++) {
			if(set.contains(arr[j])) {

			}
		}

	}
	//	@Test
	public void NextNumber() {
		
		
		int[] arr= {1,1,3,3,5,5,7,7};
		Set<Integer> set=new HashSet<Integer>();
		int count=0;
		for (int i = 0; i < arr.length; i++) {//O(n)
			set.add(arr[i]);
		}
		for (int j = 0; j < arr.length; j++) {//O(n)
			if(set.contains(arr[j]+1)) {
				count++;
			}	
		}
		System.out.println(count);
	}
	//@Test
	public void StringSlidingWindow() {

		String str="aBa";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isLowerCase(ch[i])) {
				//if()
			}
		}

	}

	//@Test
	public void addNumber() {
		int[] num = {0};
		int rem=0,singleNum=0,j=num.length-1;
		for (int i = 0; i < num.length; i++) {
			singleNum=singleNum*10+num[i];
		}
		singleNum=singleNum+1;
		System.out.println(singleNum);
		while(singleNum>0) {
				rem=singleNum%10;
				singleNum=singleNum/10;
				num[j--]=rem;
		}
		System.out.println(Arrays.toString(num));
	}
	
	@Test
	public void arraySize() {

		int[] arr= {1,2,3,4,5};
		System.out.println(arr.length);
		
	}
}
