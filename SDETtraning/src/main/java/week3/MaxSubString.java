package week3;

import org.junit.Test;

import junit.framework.Assert;

/*i
 * 
 * Add all the char in string to size of array
 * should init array size to 128
 * 
 * 
 * 
 * */
public class MaxSubString {
	@Test
	public void test1() {
		String data= "eceab";
		//3
		int k=2;
		int maximumCount=maxSubstring(data,k);
		Assert.assertEquals(maximumCount, 3);
	}
	@Test
	public void test2() {
		String data= "aabaaaaaaaaaaaaaaa";
		//3
		int k=2;
		int maximumCount=maxSubstring(data,k);
		Assert.assertEquals(maximumCount, data.length());
	}
	@Test
	public void test3() {
		String data= "qwertyuiop";
		//3
		int k=2;
		int maximumCount=maxSubstring(data,k);
		Assert.assertEquals(maximumCount, 2);
	}
	//aabcdef
	@Test
	public void test4() {
		String data= "aabcdef";
		//3
		int k=8;
		int maximumCount=maxSubstring(data,k);
		Assert.assertEquals(maximumCount, 7);
	}

	private int maxSubstring(String str,int k) {
		int left=0,right=0,uniquecount=0,max=0;
		int[] result=new int[128];

		for (right = 0; right < str.length(); right++) {
			if(result[str.charAt(right)]++==0) {
				uniquecount++;
			}
			if(uniquecount>k) {
				while(--result[str.charAt(left++)]>0) ;
				uniquecount--;
			}
			max=Math.max(max, right-left+1);
		}
		return max;	
	}
}
