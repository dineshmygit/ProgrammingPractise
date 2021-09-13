package Week6sep;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintMap {
	
	public static void main(String[] args) {
	String str="abcddeff";
	LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
	for (int i = 0; i < str.length(); i++) {
		map.put(str.charAt(i), map.getOrDefault(map.get(str.charAt(i)), 0)+1);
	}
	StringBuilder value=new StringBuilder();
	for(Character c:map.keySet()) {
		value.append(c);
	}
	StringBuilder value2=new StringBuilder();
	for(Map.Entry<Character, Integer>map2:map.entrySet()) {
		value2.append(map2.getValue());
	}
	System.out.println(value2);
	
	
	}
	

}
