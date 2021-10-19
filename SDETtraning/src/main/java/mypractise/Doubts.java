package mypractise;

import org.junit.Test;

public class Doubts {
	public static void main(String[] args) {
		String str="123";
		int count=0,mod,div,val=0;
		for (int i = 0; i < str.length(); i++) {
			count=count*10+str.charAt(i)-'0';
		}
		System.out.println(count);
	}
}
