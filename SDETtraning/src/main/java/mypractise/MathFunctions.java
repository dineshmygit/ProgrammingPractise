package mypractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MathFunctions {
	//Math max,min,abs
	//Arrays.copyOf
	
	public static void main(String[] args) {
		System.out.println(Math.abs(-7));
		int[] arr= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 2)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 7)));
		String str="aabbbcc";
		char[] arrCh=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < arrCh.length; i++) {
			map.put(arrCh[i], map.getOrDefault(arrCh[i], map.get(arrCh[i]))+1);
		}
		
	}
}
