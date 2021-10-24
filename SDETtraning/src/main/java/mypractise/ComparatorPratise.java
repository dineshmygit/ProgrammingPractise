package mypractise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ComparatorPratise {
	
	@Test
	public void test1() {
		String str="bbbbccccaaa";
		useComparator(str);
	}

	private void useComparator(String str) {
		Map<Character,Integer> map=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			//map.put(str.charAt(i),map.getOrDefault(str.charAt(i), ) );			
		}
		
	}

}
