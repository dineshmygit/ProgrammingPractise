package assesment7;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class UncommonCharacters {

	/*Input: string
	 *output: string
	 * 
	 * 
	 * */
	@Test
	public void test1() {
		String str1="aabde";
		String str2="cbaz";
		Assert.assertEquals(findUncommon(str1,str2), "decz");

	}

	private String findUncommon(String str1, String str2) {
		StringBuilder sb=new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		System.out.println(sb);
		Map<Character,Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < sb.length(); i++) {
			map.put(sb.charAt(i),map.getOrDefault(sb.charAt(i),0)+1);
		}
		System.out.println(map);
		StringBuilder result=new StringBuilder();
		for(Map.Entry entry:map.entrySet()) {
			if((int)entry.getValue()==1) {
				result.append(entry.getKey());
			}
		}
		System.out.println(result);
		return result.toString();
	}
}