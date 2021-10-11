package leetcodehashing;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LongestSubstring {
	//3. Longest Substring Without Repeating Characters
	@Test
	public void test1() {
		String s="abcabcbb";
		findLongestSubstringSet(s);

	}

	private int findLongestSubstring(String s) {
		if(s.length()==0) return 0;
		if(s.length()==1) return 1;
		Map<Character,Integer> map=new HashMap<>();
		int windowLen=0,maxLen=0,start=0,end=0;
		while(end<s.length()) {
			if(map.containsKey(s.charAt(end))) {
				windowLen=map.size();
				if(windowLen>=maxLen) {
					maxLen=windowLen;
					start++;
					end=start;
					map.clear();
					windowLen=0;
				}else {
					start++;
					end=start;
					map.clear();
					windowLen=0;
				}
			}else {
				map.put(s.charAt(end),1 );
				end++;
			}
			windowLen=map.size();
			if(windowLen>=maxLen) maxLen=windowLen;
		}
		System.out.println(maxLen);
		return maxLen;
	}
	private int findLongestSubstringSet(String s) {
		if(s.length()==0) return 0;
		if(s.length()==1) return 1;
		Set<Character> set=new LinkedHashSet<>();
		int start=0,end=0,windowLen=0,MaxLen=0;
		while(end<s.length()) {
			if(set.contains(s.charAt(end))) {
				windowLen=set.size();
				//2>3
				if(windowLen>=MaxLen) {
					MaxLen=windowLen;//3
					set.remove(s.charAt(start));//a
					start++;
				}else {
					set.remove(s.charAt(start));
					start++;	
				}
			}else {
				set.add(s.charAt(end));
				end++;//a b c 
			}
			windowLen=set.size();
			if(windowLen>=MaxLen) MaxLen=windowLen;
			windowLen=0;
		}
		System.out.println(MaxLen);
		return MaxLen;
	}
}