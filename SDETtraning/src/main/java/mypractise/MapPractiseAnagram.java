package mypractise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapPractiseAnagram {
	@Test
	public void test1() {
		String s = "anagram", t = "nagaram";
		boolean result=findAnagram(s,t);
		System.out.println(result);
	}
	@Test
	public void test2() {
		String s = "race", t = "care";
		boolean result=findAnagram(s,t);
		System.out.println(result);
	}
	@Test
	public void test3() {
		String s = "abc", t = "efg";
		boolean result=findAnagram(s,t);
		System.out.println(result);
	}

	public boolean findAnagram(String s, String t) {
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		char[] ch=t.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				if(map.get(ch[i])==1) {
					map.remove(ch[i]);
				}else {
					map.put(ch[i], map.get(ch[i])-1);
				}
			}else {				
				return false;
			}
		}
		if(map.size()>0) {
			return false;
		}
		return true;
	}
	
	

}
