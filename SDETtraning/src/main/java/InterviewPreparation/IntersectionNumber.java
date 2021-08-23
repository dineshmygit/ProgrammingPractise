package InterviewPreparation;

import static org.junit.Assert.assertEquals;

import java.security.DomainCombiner;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;

public class IntersectionNumber {

	@Test
	public void test1() {
		int[] data1= {1,2,3,4,5};
		int[] data2= {9,8,7,3,1};
		//{1,3}
		findIntersectionOfNumber(data1,data2);
	}
	@Test
	public void test2() {
		int[] data1= {5,5,5};
		int[] data2= {5,5,5};
		findIntersectionOfNumber(data1,data2);
	}
	@Test
	public void test3() {
		int[] data1= {18,11,4,20};
		int[] data2= {11,17,11,4};
		//4,11
		findIntersectionOfNumber(data1,data2);
	}
	@Test
	public void test4() {
		int[] data1= {18,11,4,20};
		int[] data2= {};
		//4,11
		findIntersectionOfNumber(data1,data2);
	}
	/*Comments*/
	private int[] findIntersectionOfNumber(int[] data1, int[] data2) {
		Arrays.sort(data1);
		Arrays.sort(data2);
		int first=0,second=0,index=0, length=0;
		if(data1.length==0 || data2.length==0){
			return new int[] {};
		}
		if(data1.length>data2.length) {
			length=data1.length;
		}else {
			length=data2.length;
		}
		while(first<length&&second<length) {
			if(data1[first]==data2[second]) {
				data1[index++]=data1[first];
				first++;
				second++;
			    }else if(data1[first]>data2[second]) {
				second++;
			}else {
				first++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(data1, 0, index)));
		return Arrays.copyOfRange(data1, 0, index);
	}
}
