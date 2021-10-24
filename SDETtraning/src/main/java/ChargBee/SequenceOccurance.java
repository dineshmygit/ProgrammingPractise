package ChargBee;

import org.junit.Test;

public class SequenceOccurance {
	
	@Test
	public void test1() {
		String str="wwwdddaaeww";
		findOccurance(str);

	}
	@Test
	public void test2() {
		String str="Asdsdaa";
		findOccurance(str);

	}
	private void findOccurance(String str) {
		StringBuilder sb=new StringBuilder();
		int start=0,end=0,count=0;
		while(end<str.length()) {
			if(str.charAt(start)==str.charAt(end)) {
				end++;
				count++;
				if(end==str.length()) {
					sb.append(str.charAt(start));
					sb.append(count);
				}
			}else {
				sb.append(str.charAt(start));
				sb.append(count);
				count=0;
				start=end;
			}
		}
		System.out.println(sb.toString());
	}
}