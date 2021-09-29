package leetcodehashing;

import java.util.Arrays;

import org.junit.Test;

public class ReversingSubArrays {
	/*Comments*/
	@Test
	public void test1() {
		int[] target = {1,2,3,4}, arr = {2,4,1,3};
		//10 10
		findReverse(target,arr);
	}

	private boolean findReverse(int[] target, int[] arr) {
		Arrays.sort(target);
		Arrays.sort(arr);
		Arrays.equals(target, arr);
		int one=0;
		int two=0;
		while(one<target.length) {
			if(target[one]==arr[two]) {
				one++;
				two++;
			}else return false;
		}
		return true;
	}
}
