package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class UniqueCharacter {
	
	/*Comments
	 * input - string
	 * output - int
	 *  
	 * 
	 * 
	 * 
	 * 
	 * */
	@Test 
	public void test1() {
		String data="statistics";
		Assert.assertEquals(findunique(data),3);
	}

	@Test
	public void test2() {
		String data="aabbcc";
		Assert.assertEquals(findunique(data),-1);
	}

	@Test
	public void test3() {
		String data="bbbcca";
		Assert.assertEquals(findunique(data),6);
	}

	/* convert the string to char[]
	 * Decalre a map with Character,Interger
	 * Iterate throught the array and get the value 
	 * Iterate the map and which has a value 1 and get the key
	 * Iterate and find the index of the key 
	 * return the index+1
	 * 
	 * */
	private Object findunique(String data) {
		char[] arr=data.toCharArray();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		char uniqueOccurance = 0;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				uniqueOccurance=entry.getKey();
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==uniqueOccurance) {
				return i+1;
			}
		}
		return -1;
	}
}
