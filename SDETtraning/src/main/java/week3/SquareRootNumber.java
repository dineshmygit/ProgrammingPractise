package week3;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;


/*
 * with the given integer 
 * Divide the given int 16 by 2 and assign to a var tmp
 * with the given integer/tmp var
 * result + tmp var =10/2=5 => tmp -5=3!=0
 * 16/2=8 tmp=8
 * 
 * 
 * */

public class SquareRootNumber {
	@Rule
	ExpectedException obj1=ExpectedException.none();
	@Test
	public void test1() {
		int data=81;
		int result=findSquareRootNumber(data);
		Assert.assertEquals(result, 9);
	}

	@Test
	public void test2() {
		int data=17;
		int result=findSquareRootNumberUsingBinary(data);
		Assert.assertEquals(result, 4);
	}
	@Rule
	ExpectedException obj=ExpectedException.none();
	@Test
	public void test3() {
		int data=-13417;
		obj.expectMessage("invalid number");
	}
	@Test
	public void test4() {
		int data=1;
		int result=findSquareRootNumberUsingBinary(data);
		System.out.println(result);
	}

	private int findSquareRootNumber(int data) {

		int result =data/2;//40
		if(data<0)throw new RuntimeException("invalid number");
		if(data<2)return data;
		for (int i = 2; i <= result; i++) {
			if(i*i==data) return i;//2*2 = 4==81
			else if(i*i>data) return i-1;	
		}
		return 0;
	}

	/*
	 * inti low=0 and high=num/2
	 * find mid and check square of mid
	 * if square of mid > expected value 
	 * move high to mid-1
	 *  repeat the process
	 *  if suq of mid < expected value move low to mid+1
	 *  return the least number
	 *  
	 *  */
	private int findSquareRootNumberUsingBinary(int data   ) {
		if(data<0)throw new RuntimeException("Invalid input");
		else if(data<2) return data; 
		else {
			int low=2,high=data/2,mid=0,midSquare=0;
			while(low<=high) {
				mid=(low+high)/2;
				midSquare=mid*mid;
				if(midSquare==data)return mid;
				else if(midSquare>data) high=mid-1;
				else low=mid+1;
			}
			return mid;
		}
	}
}
