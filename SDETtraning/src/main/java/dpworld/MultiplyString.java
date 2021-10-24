package dpworld;

import org.junit.Test;

public class MultiplyString {
	//43. Multiply Strings
	
	@Test
	public void test1() {
		String num1 = "498828660196", num2 = "840477629533";
		multiply(num1,num2);
	}
	
	 public String multiply(String num1, String num2) {
	        
	        	String result="";
				long count1=0,count2=0;
	        for (int i = 0; i < num1.length(); i++) {
	        	 count1=10*count1+num1.charAt(i)-'0';
			}
	        for (int i = 0; i < num2.length(); i++) {
	        	 count2=10*count2+num2.charAt(i)-'0';
			}
	        
	       //  result=Long.toString(count1)*Long.toString(count2);
	        System.out.println(result);
	       // return Long.toString(result);
	        return result;
	    }
	 
}
