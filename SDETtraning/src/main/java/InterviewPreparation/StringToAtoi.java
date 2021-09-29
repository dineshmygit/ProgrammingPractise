package InterviewPreparation;

import org.junit.Test;

public class StringToAtoi {
	@Test
	public void test1() {		
		String s="1";
		myAtoi(s);
	}

	private int myAtoi(String s) {
		 int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
         if(s.isEmpty()) return 0;
		char check=s.charAt(0);
        char check1=s.charAt(1);
		if(Character.isAlphabetic(check)|| check1=='+'||check1=='-') {
			return 0;
		}else {
			String result=s.trim();
			String result1=result.replaceAll("[a-zA-z]", "");
			String result2=result1.replaceAll("\\s", "");
            if(result2.isEmpty()) return 0;
			double num=Double.parseDouble(result2);
			if(num>max) {
				return max;
			}
			else if(num<min) {
				return min;
			}else return (int)num;
		}
	}

}
