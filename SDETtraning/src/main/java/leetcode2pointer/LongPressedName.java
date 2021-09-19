package leetcode2pointer;

import org.junit.Test;

public class LongPressedName {
	//925 Long pressed Name
	/*Comments*/
	@Test
	public void test1() {
		String name="saeed";
		String typed="ssaaedd";
		boolean result=findNameIsValid(name,typed);
	}

	private boolean findNameIsValid(String name, String typed) {
		int first=0,second=0;
        while(first<typed.length()){
            if(typed.charAt(first)==name.charAt(second)){
                first++;
            }else{
                second++;
                if(typed.charAt(first)==name.charAt(second)) continue;
                else if(typed.charAt(first-1)==name.charAt(second)) {
                	second++;
                	continue;	
                }
                   else return false;
            }
            
        }
         return true;
	}

}
