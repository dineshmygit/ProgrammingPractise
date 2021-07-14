package week2;

import java.util.Arrays;

import org.junit.Test;

public class ShortestDistance {

	@Test
	public void test1() {
		String str="aaab";
		char target='b';
		findShortestDsitance2(str,target);
	}
	@Test
	public void test2() {
		String str="loveleetcode";
		char target='e';
		findShortestDsitance2(str, target);
	}
	@Test
	public void test3() {
		String str="abaa";
		char target='b';
		findShortestDsitance2(str, target);
	}

	//convert to string array
	/*
	 * iterate through array 
	 * find target value, 
	 * get index Manipulate the index with
	 * before index
	 */

	public void findShortestDsitance(String s,char c) {
		
		
	}

	public void findShortestDsitance2(String s,char target) {
		System.out.println(Integer.MAX_VALUE);
		int[] leftarr=new int[s.length()];
		int[] rightarr=new int[s.length()];

		Arrays.fill(leftarr, Integer.MAX_VALUE);
		Arrays.fill(rightarr, Integer.MAX_VALUE);

		int targetIndex=Integer.MAX_VALUE;

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==target) {
				targetIndex=0;
				leftarr[i]=targetIndex;
			}else {
				if(targetIndex!=Integer.MAX_VALUE) {
					targetIndex++;
					leftarr[i]=targetIndex;
				}
			}
		}
		for (int j = s.length()-1; j >=0; j--) {
			if(s.charAt(j)==target) {
				targetIndex=0;
				rightarr[j]=targetIndex;
			}else {
				if(targetIndex!=Integer.MAX_VALUE) {
				targetIndex++;
				rightarr[j]=targetIndex;
				}
			}
		}
		System.out.println(Arrays.toString(leftarr));
		System.out.println(Arrays.toString(rightarr));
		int[] resultArray =new int[s.length()];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i]=Math.min(leftarr[i], rightarr[i]);
		}
		System.out.println(Arrays.toString(resultArray));
	}
}
