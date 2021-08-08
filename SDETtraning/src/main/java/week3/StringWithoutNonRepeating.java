package week3;

import org.junit.Test;

public class StringWithoutNonRepeating {
	@Test
	public void test1() {
      String data="abcabcbb";
     int maxCount= findingNonRepeating(data);
	}
	@Test
	public void test2() {
      String data="pwwkew";
     int maxCount= findingNonRepeating(data);
	}

	private int findingNonRepeating(String str) {

		
		//"abcabcbb";
		int left=0,right=0,uniquecount=0,max=0;
		int[] result=new int[128];

		for (right = 0; right < str.length(); right++) {
			if(result[str.charAt(right)]++==0) {
				uniquecount++;
			}
			else{
				while(result[str.charAt(left++)]-->1) ;
				//uniquecount--;
			}
			max=Math.max(max, right-left+1);
		}
		System.out.println(max);
		return max;	
	
	}
	
	

}
