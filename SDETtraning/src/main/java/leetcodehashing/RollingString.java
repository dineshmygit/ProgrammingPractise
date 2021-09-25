package leetcodehashing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class RollingString {
	/*Comments*/
	@Test
	public void test1() {
		String s="abc";
		List<String> operations=new ArrayList<>();
		operations.add("0 0 L");
		operations.add("2 2 L");
		operations.add("0 2 R");
		findRollingStringNew(s,operations);

	}
	private String findRollingString(String s, List<String> operations) {
		StringBuffer rollString=new StringBuffer(s);
		for (int i = 0; i < operations.size(); i++) {
			String str[]=operations.get(i).split("\\s+");
			for (int j = Integer.parseInt(str[0]); j <=Integer.parseInt(str[1]); j++) {
				if(str[2].equalsIgnoreCase("L")){
					char temp=rollString.charAt(j);
					if(temp=='a'){
						temp='z';
					}else{
						temp--;
					}
					rollString.setCharAt(j, temp);
				}else{
					char temp=rollString.charAt(j);
					if(temp=='z'){
						temp='a';
					}else{
						temp++;
					}
					rollString.setCharAt(j, temp);
				}
			}
		}
		System.out.println(rollString.toString());
		return rollString.toString();
	}  
	private String findRollingStringNew(String s, List<String> operations) {
		StringBuilder sb=new StringBuilder(s);
		for (int i = 0; i < operations.size(); i++) {
			String[] split = operations.get(i).split("\\s+");
			for (int j = Integer.parseInt(split[0]); j <= Integer.parseInt(split[1]); j++) {
				if(split[2].equalsIgnoreCase("L")) {
					char tmp=sb.charAt(j);
					if(tmp=='a') {
						tmp='z';	
					}else 
						tmp--;
					sb.setCharAt(j, tmp);
				}else {
					if(split[2].equalsIgnoreCase("R")) {
						char tmp=sb.charAt(j);
						if(tmp=='z') {
							tmp='a';	
						}else 
							tmp++;
						sb.setCharAt(j, tmp);
					}
				}	
			}
		}
		System.out.println(sb);
		return sb.toString();
	}
}