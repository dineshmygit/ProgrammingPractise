package slidingwindowprograms;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.html.FormSubmitEvent;

import org.junit.Test;

public class LongestSubstringKdistintCharcaters {
	/*Comments*/
	@Test
	public void test1() {
		String str="abcbdbdbbdcdabd";
		int k=3;
		findLongestSubtring(str,k);
	}

//	@Test
	public void test2() {
		String str="abcbdbdbbdcdabd";
		int k=5;
		findLongestSubtring(str,k);
	}

	//@Test
	public void test3() {
		String str="abcbdbdbbdcdabd";
		int k=2;
		findLongestSubtring(str,k);
	}

	private String findLongestSubtring(String str, int k) {
		/*start=0 end =0
		 * Create a map 
		 * insert into map with each char as key and count as value
		 * create a string builder and append the character
		 * when map size is greater than 2 
		 * */
		int start=0,end=0,currentStringlen=0,maxStringLen=0;
		String tmp="",resultString="";
		Map<Character,Integer> map=new LinkedHashMap();
		while(end<str.length()) {
			map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0)+1);
			if(map.size()<=k) {
				end++;
			}else {
				map.put(str.charAt(start),map.get(str.charAt(start))-1);
				if(map.get(str.charAt(start))==0){
					map.remove(str.charAt(start));
				}
				tmp=str.substring(start, end);
				if(maxStringLen<tmp.length()) {
					maxStringLen=tmp.length();
					resultString=tmp;
				}
				start++;
				end=end+1;
			}
		}
		if(k>map.size()) {
			System.out.println(str);
			return str;	
		}
		System.out.println(resultString);
		return resultString;
	}
}