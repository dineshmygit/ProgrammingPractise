package week5;

import org.junit.Test;

import junit.framework.Assert;

public class StringCharcater {

	/*Comments*/
	//@Test
	/*
	 * public void test1() { String data= "aaavffvdd"; String target="v";
	 * findTargetCharacter(data,target); }
	 */

	@Test
	public void test2() {

	}

	@Test
	public void test3() {
		String data= "aaavffvdd";
		String target="v";
		int count=0;
		Assert.assertEquals(findTargetCharacter(data,target,count),2);
	}

	/* av 
	 * if string does not contain target break
	 * if target is found increment the count and replace the first found as empty
	 *  return  count
	 * 
	 * */
	private int findTargetCharacter(String data, String target,int count) {
		if(!data.contains(target)) {
			return 0;
		}
		
		if(data.contains(target)) {
			data=data.replaceFirst(target, "");
			count++;
		}
		 findTargetCharacter(data,target,count);
		 return count;
	}
}
