      package leetcodehashing;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class ValidAnagram {
	/*Comments*/
	@Test
	public void test1() {
		String s = "anagram", t = "nagaram";
		Assert.assertEquals(isAnagram(s,t), true);
	}
	public void test2() {
		String s = "rat", t = "car";
		Assert.assertEquals(isAnagram(s,t), false);
	}
	//Time complexity:O(n) Spacecomplexity:O(1)
	private Object isAnagram(String s, String t) {
		 int[] arr=new int[26];
		 
	        if(s.length()!=t.length()) return false;
	        for(int i=0;i<s.length();i++){
	           arr[s.charAt(i)-'a']++; 
	           arr[t.charAt(i)-'a']--; 
	        }
	        for (int i = 0; i < arr.length; i++) {
				if(arr[i]==0) continue;
				else return false;
			}
		
	        return true;
		
	}
	//Time complexity:O(n)
	private Object isAnagramUsingMap(String s, String t) {
		Map<Character,Integer> map=new HashMap<>();
		 if(s.length()!=t.length()) return false;
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		}
		for (int i = 0; i < t.length(); i++) {
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
		}
		for(Map.Entry entry:map.entrySet()) {
			if((int)entry.getValue()==0) continue;
			else return false;
		}	
		return true;
	}
	
	//Time complexity:O(n log(n)
	private Object isAnagramUsingSort(String s, String t) {
		char schar[] = s.toCharArray();
        char tchar[] = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return Arrays.equals(schar, tchar);
	}
}
