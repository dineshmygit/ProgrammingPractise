package Week1sep;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class SecondMinimumOccuranceString {
	/*Comments*/
	@Test
	public void test1() {
		String data="hello there";
		findSecondOccurance(data);
	}

	private void findSecondOccurance(String data) {
		Map<Character,Integer> map=new TreeMap<>();
		for (int i = 0; i < data.length(); i++) {
			map.put(data.charAt(i), map.getOrDefault(data.charAt(i), 0)+1);
		}
		System.out.println(map);
		Integer min = Collections.min(map.values());
		int count=0;
		for (int i = 0; i < map.size(); i++) {
			if(map.containsValue(min)) {
				count++;
				if(count==2) {
					
					break;
				}
					
			}
		}


	}
}
