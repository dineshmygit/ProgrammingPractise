package leetcodehashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class PractiseStringAcsii {
	
	/*Comments*/
	//@Test
	public void test1() {
		String[] words={"abc","aabc","bc"};
		Assert.assertEquals(makeEquals(words), true);
	}
	@Test
	public void test2() {
		String[] words={"abc","aabc","bc"};
		Assert.assertEquals(makeEqualsUsingMap(words), true);
		//makeEqualsUsingMap(words);
	}


	public boolean makeEquals(String[] words) {
		int[] acsii=new int[26];
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				acsii[words[i].charAt(j)-'a']++;
			}
		}
		int length=words.length;
		for (int i = 0; i < acsii.length; i++) {
			if(acsii[i]%length==0) continue;
			else return false;
		}
		return true;
	}
	public boolean makeEqualsUsingMap(String[] words) {
		Map<Character,Integer> map=new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {	
			map.put(words[i].charAt(j), map.getOrDefault(words[i].charAt(j), 0)+1);
			}
		}
		int length=words.length;
		for(Map.Entry entry:map.entrySet()) {
			if(((int)entry.getValue())%length==0) continue;
			else return false;
		}
		return true;
	}

}
