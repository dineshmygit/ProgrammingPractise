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
		Map<String,List<String>> map=new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] arr=strs[i].toCharArray();
			Arrays.sort(arr);
			String word = new String(arr);
			String word1 = arr.toString();
			System.out.println(word);
			System.out.println(word1);
			if(map.containsKey(word)) {
				List<String> list = map.get(word);
				list.add(strs[i]);
				map.put(word, list);
			}else {
				List<String> groupList=new ArrayList<>(Arrays.asList(strs[i]));
				map.put(word, groupList);
			}
		}
		List<List<String>> resultList=new ArrayList<>(map.values());
		System.out.println(resultList);
	}
}