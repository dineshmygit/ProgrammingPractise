package leetcodehashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagrams {
	/*49. Group Anagrams
	 * */
	@Test
	public void test1() {
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		isGroupAnagram(strs);
	}

	private void isGroupAnagram(String[] strs) {
		Map<Map<Character,Integer>,List<String>> map=new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			Map<Character,Integer> innerMap=new HashMap<>();
			char[] ch=strs[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				innerMap.put(ch[j], innerMap.getOrDefault(ch[j], 0)+1);
			}
			if(map.containsKey(innerMap)) {
				List<String> list = map.get(innerMap);
				list.add(strs[i]);
				map.put(innerMap, list);
			}else {
				List<String> groupList=new ArrayList<>(Arrays.asList(strs[i]));
				map.put(innerMap, groupList);
			}
		}
		List<List<String>> resultList=new ArrayList<>(map.values());
		System.out.println(resultList);
	}

}
