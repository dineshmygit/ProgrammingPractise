package mypractise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Anagram {
	/*Comments*/
	@Test
	public void test1() {
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		findAnangram(str);
	}

	@Test
	public void test2() {
		String str="kishore";
		findAnagramString(str);
	}


	@Test
	public void test3() {
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		findAnangram(str);
	}

	private void findAnangram(String[] str) {
		char[] ch= {};

		int[] ascii=new int[26];
		//for(char c:str.)

			for(int i = 0; i < str.length; i++)
			{
				ch=str[i].toCharArray();


			}
		System.out.println(ch);
	}
	private void findAnagramString(String str) {
		int[] arr=new int[26];
		for(char c:str.toCharArray()) {
			arr[c-'a']++;
		}

	}

}
