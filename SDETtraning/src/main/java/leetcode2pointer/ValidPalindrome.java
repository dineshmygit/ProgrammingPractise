package leetcode2pointer;

import org.junit.Test;

public class ValidPalindrome {
	/*Comments*/
	@Test
	public void test1() {
		String s = "1A man,  a plan, a canal: Panama1";
		isValidPalindrome(s);
	}
	

	private boolean isValidPalindrome(String s) {
		String result=s.replaceAll("[^a-zA-Z0-9]","");
        int start=0,end=result.length()-1;
        if(s.isEmpty()) return true;
        else if(result.length()==1) {
        	if(Character.toLowerCase(result.charAt(start))==result.charAt(start)) {
        		return true;
        	}else return false;	
        }
        while(start<end){
            if(Character.toLowerCase(result.charAt(start))==Character.toLowerCase(result.charAt(end))){
                start++;
                end--;
            }else return false;
        }
        System.out.println(result);
        return true;
	}
	private boolean isValidPalindromeNew(String s) {
		s = s.toLowerCase();
		int left=0, right =s.length()-1;
		while (left < right) {
			char leftchar = s.charAt(left);
			char rightchar = s.charAt(right);
			if (!isalphaNumeric(leftchar)) {
				left++;
			} else if (!isalphaNumeric(rightchar) ) {
				right--;
			} else if (leftchar == rightchar) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
    	}
      public boolean isalphaNumeric(char c) {
         if((48<=c && c<=57) || (c >= 97 && c <= 122)) {
			return true;
		}
		else {
			return false;
		}}
	}
