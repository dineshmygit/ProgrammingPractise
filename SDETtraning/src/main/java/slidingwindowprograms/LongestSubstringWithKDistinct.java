package slidingwindowprograms;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubstringWithKDistinct {
	@Test
	public void test1() {
		String str= "AAAHHIBC";
		int k=2;
		findLongestSubstring(str,k);
	}

	private int findLongestSubstring(String str, int k) {
		int startWindow=0;
		int maxWindowSize=0;
		int currentWindowSize=0;
		
		Map<Character, Integer> map=new HashMap<>();
		for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
			if(map.size()<=k) {
				map.put(str.charAt(windowEnd), map.getOrDefault(str.charAt(windowEnd), 0)+1);
			}else {
				for(Map.Entry entry:map.entrySet()) {
					currentWindowSize+=(int)entry.getValue();
				}
				int value=map.get(str.charAt(windowEnd-1));
				if(currentWindowSize-value > maxWindowSize) {
					maxWindowSize=currentWindowSize-value;
				}
				if(map.get(str.charAt(startWindow))==0) {
					map.remove(str.charAt(startWindow));
				}else {
					map.put(str.charAt(startWindow), map.getOrDefault(str.charAt(startWindow), 0)-1);
				}
				currentWindowSize=0;
				startWindow++;
				windowEnd--;
			}
		}
		return maxWindowSize;
	}
}