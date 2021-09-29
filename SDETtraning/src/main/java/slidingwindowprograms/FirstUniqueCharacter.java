package slidingwindowprograms;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class FirstUniqueCharacter {
	/*Comments*/
	@Test
	public void test1() {
		String s = "dddccdbba";
		findUniqueIndexAscii(s);
	}
	private int findUniqueIndex(String s) {
		 Map<Character,Integer> map=new LinkedHashMap<>();
	        int count=0;
	        char result=' ';
	        for(int i=0;i<s.length();i++){
	            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	        }
	        for(Map.Entry entry:map.entrySet()){
	            if((int)entry.getValue()==1){
	                result=(Character)entry.getKey();
	            }
	        }
	        if(result!=' ') {
	        	count= s.indexOf(result);
	        	return count;
	        }
	            else return -1;
	}
	private int findUniqueIndexAscii(String s) {
		 int[] freq = new int[26];
		 for(char c:s.toCharArray()) {
			 freq[c-'a']++;
		 }
		 int i=0;
		for(char c:s.toCharArray()) {
			if(freq[c-'a']==1) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
