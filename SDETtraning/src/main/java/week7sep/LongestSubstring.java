package week7sep;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubstring {
	/*Comments*/
	@Test
	public void test1() {
		String s="dvdf";
		lengthOfLongestSubstring(s);
	}
	private int findLongestString(String s) {
		int left=0,right=0,count=0,max=0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		while(right<s.length()) {
			if(map.containsKey(s.charAt(right))) {
				left++;
				right=left;
				map.clear();
				count=0;
			}else {
				map.put(s.charAt(right), 1);
				right++;
				count++;
				if(max<count) max=count;
			}
		}
		System.out.println(max);
		return max;	
	}
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int len = 0, pos = 0;

		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i)))
				pos = Math.max(pos, map.get(s.charAt(i))+1);
			len = Math.max(len, i-pos+1);
			map.put(s.charAt(i),i);
		}
		return len;
	}
}
