package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;
/*Test data set
	input:
	Target:
	output:
Ask for hints and constraints
Alternative solution
time complexity:
space complexity :  
write Pseudo code

 */

public class NoOfCharacter {
	@Test
	public void test1() {  
		String str="aabbccddde";//positive
		Assert.assertEquals(findNoOfchar(str),"a2b2c2d3e1" );
	}
	@Test
	public void test2() {  
		String str="aaaaa";//positive
		Assert.assertEquals(findNoOfchar(str),"a5" );
	}
	@Test
	public void test3() {  
		String str="";//positive
		Assert.assertEquals(findNoOfchar(str),"" );
	}
	private Object findNoOfchar(String str) {
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		StringBuilder sb=new StringBuilder();
		for (Entry<Character, Integer> entry :map.entrySet()) 
		{
			Character key =entry.getKey();
			Integer value = entry.getValue();
			sb.append(key+""+value);
		}
		return sb.toString();
	}
}
