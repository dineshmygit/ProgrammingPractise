package mypractise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubstringDistinct {
	/*Comments*/
	@Test
	public void test1() {

	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {
		String data="abcabbaa";
		findLongestSubstring(data);
	}

	private void findLongestSubstring(String data) {
		char[] arr=data.toCharArray();
		int count=0;
		//left=0,right=
		for (int i = 0; i < arr.length; i++) {
			Map<Character, Integer>map=new HashMap<Character, Integer>();
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				count=map.size();
			//	map.remove(arr[left])
			}
		}
		System.out.println(count);
	}
}
