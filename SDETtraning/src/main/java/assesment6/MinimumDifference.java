package assesment6;

import java.util.Arrays;

import org.junit.Test;

public class MinimumDifference {
	/*Comments*/
	@Test
	public void test1() {
		int[] data= {4,3,1,2};
		System.out.println(findMinimumDifference2(data));
	}

	@Test
	public void test2() {
		int[] data= {1,2,3,4,5};
		System.out.println(findMinimumDifference2(data));
	}

	@Test
	public void test3() {
		int[] data= {1,2,3,4,5,6};
		System.out.println(findMinimumDifference2(data));
	}
	@Test
	public void test4() {
		int[] data= {1,2,3};
		System.out.println(findMinimumDifference2(data));
	}

	/*  
	 * Create two pointers start and end
	 * add the value of start and end values in var
	 * move the pointers start++, end--
	 * break when start>=end
	 * 1,2,3,4,5,6
	 * length/2=4
	 * 4-1 =3
	 * 
	 * */
	private int findMinimumDifference2(int[] data) {
		int length=data.length;
		if(length%2==0) {
			if((data.length/2)%2==0) return 0;
			else return 1;
		}else {		
			if(((data.length-1)/2)%2==0) return 1;
			else return 0;
		}
	}
}