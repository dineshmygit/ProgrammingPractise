package leetcodehashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class IsomorphicString {

	//205 Iomorphic STrings

	@Test
	public void test1() {
		String s="egg";
		String t="add";
		isIsomorphic(s,t);
	}

	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()) return false;
		Map<Character,Character> map=new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				if(map.get(s.charAt(i))==t.charAt(i)){
					continue;
				}else return false;

			}else{
				map.put(s.charAt(i),t.charAt(i));
			}
		}
		return true;
	}
}
