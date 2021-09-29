package leetcodehashing;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ConcatenatedStringMaxLen {
	/*Comments trimble,retailmenot,palo Alto
	 * 1239. Maximum Length of a Concatenated String with Unique Characters*/
	@Test
	public void test1() {
		List<String> arr=Arrays.asList("un","iq","ue");
		findMaxLen(arr);
	}

	private int findMaxLen(List<String> arr) {
		if(arr.size()==0) return 0;
		StringBuilder sb=new StringBuilder();
		Map<Character,Character> map=new LinkedHashMap<>();
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).length(); j++) {
				if(map.containsKey(arr.get(i).charAt(j))) {
					break;
				}else {
					map.put(arr.get(i).charAt(j), arr.get(i).charAt(j));
				}
			}
		}
		return 0;
	}

}
