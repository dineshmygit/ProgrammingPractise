package Week6sep;

import java.util.Arrays;

import org.junit.Test;

//reverse the given entence by its word 
//	today is a beautiful day
//less than O(n)
public class ReverseString {
	@Test
	public void test1() {
		String str="today  is a beautiful day";
		reverseString(str);
	}

	private void reverseString(String str) {
		String[] split = str.split(" ");
		int len=split.length;
		StringBuilder sb=new StringBuilder();
		for (int i = len-1; i >= 0; i--) {
			sb.append(split[i]+" ");
		}
		System.out.println(sb.toString());	
	}
}
