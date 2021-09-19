package leetcode2pointer;

import org.junit.Test;

public class DIStringMatch {
	/*Comments*/
	@Test
	public void test1() {
		//942. DI String Match
		String s="IDID";
		findDiString(s);
	}

	private int[] findDiString(String s) {
		int start=0,end=s.length();
		int[] result=new int[s.length()+1];
		int i=0;
		while(start<=end) {
			if(i<s.length()) {
				if(s.charAt(i)=='I') {
					result[i++]=start;
					start++;
				}else {
					result[i++]=end;
					end--;
				}
			}else {
				result[i]=start;
				if(start==end) break;
			}
		}
		return result;
	}
}
