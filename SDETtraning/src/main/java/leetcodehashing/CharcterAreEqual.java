package leetcodehashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class CharcterAreEqual {
	
	/*Comments*/
	@Test
	public void test1() {
		String s = "abacbc";
		areOccuranceEqual(s);
	}

	private boolean areOccuranceEqual(String s) {
		 Map<Character,Integer> map=new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	        }
	        Set<Integer> set=new HashSet<>();
	        for(Map.Entry entry:map.entrySet()){
	        	if(set.isEmpty()) set.add((int)entry.getValue());
	           if(!set.contains((int)entry.getValue())) return false;
	        }
	        return true;	
	}
}
