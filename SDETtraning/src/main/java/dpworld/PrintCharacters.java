package dpworld;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class PrintCharacters {
	
	@Test
	public void test1() {
		String s="Vv";
		findCharcater(s);

	}
	//Vv
	private void findCharcater(String s) {
		
		Map<Character,Integer> map=new LinkedHashMap();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a') {
				char big=Character.toUpperCase(s.charAt(i));
				if(map.containsKey(big)) map.put(big, map.get(big)+1);
				else map.put(s.charAt(i), 1);
			}else if(s.charAt(i)<'a') {
				char small=Character.toLowerCase(s.charAt(i));
				if(map.containsKey(small)) map.put(small, map.get(small)+1);
				else map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);
	}
}