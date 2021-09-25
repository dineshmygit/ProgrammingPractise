package leetcodehashing;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {
	/*Comments*/
	@Test
	public void test1() {
		String s="codeleet";
		int[] indices= {4,5,6,7,0,2,1,3};
		Assert.assertEquals(restoreString(s,indices), "leetcode");
	}

	private String restoreString(String s, int[] indices) {
		StringBuilder sb=new StringBuilder(s);
		for (int j = 0; j < indices.length; j++) {	
			sb.setCharAt(indices[j], s.charAt(j));
		}
		return sb.toString();
	}

	private String restoreStringUsingTreemap(String s, int[] indices) {
		Map<Integer,Character> map=new TreeMap<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			map.put(indices[i],s.charAt(i));
		}
		for(Map.Entry entry:map.entrySet()){
			sb.append(entry.getValue()+"");
		}
		return sb.toString();
	}
}