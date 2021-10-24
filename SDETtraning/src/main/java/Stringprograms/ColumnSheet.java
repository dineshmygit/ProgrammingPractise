package Stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class ColumnSheet {

	@Test
	public void test1() {
		int column=701;
		findColumn(column);

	}

	private void findColumn(int column) {
		char ch;
		StringBuilder result=new StringBuilder();
		while(column>0) {
			
			column--;
			//int check=column%26;
			ch=(char)(column%26+'A'+' ');//
			result.append(ch);
			column/=26;
		}
		System.out.println(result.reverse());
	}
}