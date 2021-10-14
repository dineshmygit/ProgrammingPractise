package leetcodehashing;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class OccuranceOfEachCharacter {
	@Test
	public void test1() {
		String name = "kamalakannan";
		findOccurance(name);
		

	}

	private void findOccurance(String name) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < name.length(); i++) {
			map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry entry:map.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
	}

}
