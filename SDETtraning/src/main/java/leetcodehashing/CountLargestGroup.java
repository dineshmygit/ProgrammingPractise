package leetcodehashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class CountLargestGroup {
	/*Comments
	 * 1399. Count Largest Group
	 * */
	@Test
	public void test1() {
		int n=46;
		findLargestGroup(n);
	}

	//@Test
	public void test2() {
		int n=24;
	}

	//@Test
	public void test3() {
		int n=24;
	}
	
	private int findLargestGroup(int n) {
		int count=0;
		if(n>10) {
		int result=findNum(n);
		System.out.println(result);
		return result;
		}
		else {
			for (int i = 1; i <= n; i++) {
				count++;
			}
			return count;
		}
	}

	private int findNum(int n) {
		Map<Integer,Integer> map =new HashMap<>();
		int div=0,mod=0;
		div=n/10;
		mod=n%10;
		System.out.println(div+" "+mod);
		int value=div*10;
		for (int i = 1; i <= mod+1;) {
			map.put(i++, value++);
		}
		return map.size();
	}
}
