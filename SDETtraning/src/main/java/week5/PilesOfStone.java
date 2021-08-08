package week5;

import java.util.ArrayDeque;
import java.util.Arrays;

import org.junit.Test;

public class PilesOfStone {
	@Test
	public void test1() {
		int[] data= {5,3,4,5};
		Arrays.copyOf(data, 1);
		boolean resultAlex=findMaximumPiles(data);
	}
	@Test
	public void test2() {

	}
	@Test
	public void test3() {
		int[] data= {};
		boolean resultAlex=findMaximumPiles(data);
	}
	/*Comments
	 * input: int[]
	 * return type is boolean
	 * pseudo code:
	 * iterate through array
	 * add int[] into array deque
	 * remove the even elements and add
	 * remove the odd elements and add
	 * compare the first and last element and remove accordingly
	 * if even sum is max than odd sum then return true
	 * else return false
	 * */
	private boolean findMaximumPiles(int[] data) {
		int sum1=0,sum2=0;
		ArrayDeque<Integer> piles=new ArrayDeque<Integer>();
		for (int i = 0; i < data.length; i++) {
			piles.offer(data[i]);			
		}
		for (int i = 0; i < data.length; i++) {

			if(i%2==0) {
				if(piles.peekFirst()>piles.peekLast()) {
					sum1+=piles.pop();
				}else if(piles.peekFirst()<piles.peekLast()) {
					sum1+=piles.removeLast();
				}else {
					sum1+=piles.pop();
				}
			}else {
				if(piles.peekFirst()>piles.peekLast()) {
					sum2+=piles.pop();
				}else if(piles.peekFirst()<piles.peekLast()) {
					sum2+=piles.removeLast();
				}else {
					sum2+=piles.pop();
				}
			}
		}
		if(sum1>sum2) return true;
		else return false;
	}
}
