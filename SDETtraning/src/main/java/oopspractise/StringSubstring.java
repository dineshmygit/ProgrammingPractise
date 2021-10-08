package oopspractise;

import java.util.Map;
import java.util.TreeMap;

public class StringSubstring {
	public static void main(String[] args) {
		treeMap();
		String str="abcdefghij";
		System.out.println(	str.subSequence(0, 5));
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,5));
		
		String a1="abc";
		String a2="bca";
		if(a1.equals(a2)) {
			System.out.println("true");
		}
	}
	public static void treeMap() {
		Map<Character,Integer> map=new TreeMap<>();
		map.put('z', 1);
		map.put('y', 1);
		map.put('x', 1);
		System.out.println(map);
	}
	

}
