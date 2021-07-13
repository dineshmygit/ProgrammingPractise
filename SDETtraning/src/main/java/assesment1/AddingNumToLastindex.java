package assesment1;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class AddingNumToLastindex {

	@Test
	public void test1() {
		int[] num = {1,2,3};
		assertArrayEquals(addingNumber(num), new int[] {1,2,4});
	}

	@Test
	public void test2() {
		int[] num = {0};
		assertArrayEquals(addingNumber(num), new int[] {1});
	}

	@Test
	public void test3() {
		int[] num = {9,9,9,9,9,9,9,9,9};
		assertArrayEquals(addingNumber(num), new int[] {1,0,0,0,0,0,0,0,0,0});
	}

	private int[] addingNumber(int[] num) {
		int rem=0,positiveInteger=0;
		for (int i = 0; i < num.length; i++) {
			positiveInteger=positiveInteger*10+num[i];
		}
		positiveInteger++;
		//Finding length to make dynamic array 
		int duplicate=positiveInteger,count=0;
		
		//Converting toString O(n)
		//count = Integer.toString(duplicate).length();
        
		//Using same data type
		 int value=positiveInteger; 
		    while(value>0)
			 value=value/10; count++; 
			
		//Adding incremented number to array
		int[] arrayAdded=new int[count];
		while(positiveInteger>0) {
			rem=positiveInteger%10;
			positiveInteger=positiveInteger/10;
			arrayAdded[count-1]=rem;
			count--;
		}
		return arrayAdded ;
	}
}
