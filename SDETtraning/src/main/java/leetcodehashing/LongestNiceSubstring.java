package leetcodehashing;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestNiceSubstring {
	/*Comments
	 * 1763. Longest Nice Substring
	 * */
	@Test
	public void test1() {
		String s = "YazaAay";
		longestNiceString(s);
	}

	private String longestNiceString(String s) {
		if(s.length()==0) return "";
		int start=0,slide=1;
		StringBuilder sb=new StringBuilder();
		while(slide<s.length()) {
			char charAt = s.charAt(slide);
			if(s.charAt(start)<'a') {
				if(String.valueOf(s.charAt(start)).
						equals(String.valueOf(s.charAt(slide)).toUpperCase())){
					sb.append(s.charAt(start));
					sb.append(s.charAt(slide));
					start=slide;
					slide=start+1;
				}else {
					start=slide;
					slide=start+1;
				}
			}else {
				if(String.valueOf(s.charAt(start)).
						equals(String.valueOf(s.charAt(slide)).toLowerCase())){
					sb.append(s.charAt(start));
					sb.append(s.charAt(slide));
					start=slide;
					slide=start+1;
				}else {
					start=slide;
					slide=start+1;
				}
			}
		}
		System.out.println(sb);
		if(sb.length()>0) return sb.toString();
		return "";
	}
}
