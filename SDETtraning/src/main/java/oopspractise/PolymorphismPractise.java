package oopspractise;

import java.util.HashMap;
import java.util.Map;

public class PolymorphismPractise {
	public static void main(String[] args) {
		String str="aabbcdd";
		Map<Character,Integer> map=new HashMap<>();
		for (int j = 0; j < str.length(); j++) {	
			map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)+1);
		}
		for(Map.Entry entry:map.entrySet()) {
			if((int)entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
