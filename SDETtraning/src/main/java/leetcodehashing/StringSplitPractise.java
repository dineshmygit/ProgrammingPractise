package leetcodehashing;

import java.util.Arrays;

public class StringSplitPractise {

	public static void main(String[] args) {
		String str = "Hello I'm your    String";
		String[] splited = str.split(" ");
		System.out.println(Arrays.toString(splited));
		String str1 = "Hello I'm your    String";
		String[] splited1 = str1.split("\\s+");
		System.out.println(Arrays.toString(splited1));
	}

}
