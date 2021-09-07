package Week6sep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LongestSubstring {
	/*Comments*/
	@Test
	public void test1() {
		String s="abcabcbb";
		findLongestSubstringMap(s);
	}

//	@Test
	public void test2() {
		String s="bbbbb";
		findLongestSubstring(s);
	}

//	@Test
	public void test3() {
		String s="pwwkew";
		findLongestSubstring(s);
	}

	private void findLongestSubstring(String s) {
		char[] charArray = s.toCharArray();
		int max=0;
		Set<Character> set= new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			int count=1;
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i]==charArray[j]) {
					break;
				}else {
					count++;
				}
			}
			if(count>max) {
				max=count;
			}
		}
		System.out.println(max);
	}
	private void findLongestSubstringMap(String s) {
		char[] charArray = s.toCharArray();
		int max=0,length=0,count=0;
		Map<Character,Integer> map =new HashMap<Character,Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				int len=0;
				while(len<=length) {
					map.remove(charArray[len++]);
				}
			}else {
				map.put(charArray[i], 1);
				length=map.size();
			}
			i=count++;
		}
		
		
		System.out.println(max);
	}
}
