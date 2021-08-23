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

	}

	@Test
	public void test3() {
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		findAnangram(str);
	}

	private void findAnangram(String[] str) {
		  char[] ch;
		  int[] ascii=new int[26];
		  for (int i = 0; i < ascii.length; i++) {
			str[i].toCharArray();
		}
		  
		  for(int i = 0; i < str.length; i++)
		    {
		       ch=str[i].toCharArray();
		       
		       
		    }
	}

}
