package week2;

import java.util.Iterator;

import org.junit.Test;

/*solve with sliding window
 * return count of satisfied customer in integer
 * 
 * iterate through array
 * if not grumpy add the customer count
 * store in a counter
 * 
 * 
 * 
 * */

public class BookStoreSlidingWindow {
	@Test
	public void test1() {
		int[] customers = {1,0,1,2,1,1,7,5};
		int[] grumpy =    {0,1,0,1,0,1,0,1};
		int x=3;//grace time 
		satisfiedCustomersCount(customers,grumpy,x);
	}
	public void test2() {

	}

	private void satisfiedCustomersCount(int[] customers, int[] grumpy, int x) {
		int satisfiedCount=0;
		for (int i = grumpy.length-1; i >= grumpy.length-x; i--) {
			if(grumpy[i]==1) {
				grumpy[i]=0;
			}
		}
		for (int i = 0; i < customers.length; i++) {
			if(grumpy[i]==0) {
				satisfiedCount+=customers[i];
			}
		}
		System.out.println(satisfiedCount);
	}
}








