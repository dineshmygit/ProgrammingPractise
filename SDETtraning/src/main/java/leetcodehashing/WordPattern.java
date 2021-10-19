package leetcodehashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class WordPattern {

	@Test
	public void test1() {
		String pattern = "abba";
		String s = "dog cat cat bird";
		wordPattern(pattern,s);
		
	}


	public boolean wordPattern1(String pattern, String s) {
		String[] split = s.split("\\s+");
		Map<Character,String> map=new HashMap<>();
		Map<String,Character> map1=new HashMap<>();
		for(int i=0;i<pattern.length();i++){
			if(map.containsKey(pattern.charAt(i))) {
				if(map.get(pattern.charAt(i)).equals(split[i])){
					continue;
				}else {
					return false;   
				}
			}else{
				map.put(pattern.charAt(i),split[i]);
			}
		}
		for(int i=0;i<pattern.length();i++){
			if(map1.containsKey(split[i])) {
				if(map.get(split[i]).equals(pattern.charAt(i))){
					continue;
				}else {
					return false;   
				}
			}else{
				map1.put(split[i],pattern.charAt(i));
			}
		}

		return true;
	}

	public boolean wordPattern(String pattern, String s) {
		Map<Character, Integer> map1 = new LinkedHashMap<>();
		Map<String, Integer> map2 = new LinkedHashMap<>();
		String[] strs = s.split(" ");
		if (pattern.length() != strs.length) {
			return false;
		}

		for (Integer i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			if (map1.put(c, i) != map2.put(strs[i], i)) {
				return false;
			}
		}
		return true;
	}
}