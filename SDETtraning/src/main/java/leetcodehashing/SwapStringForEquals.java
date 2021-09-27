package leetcodehashing;

import org.junit.Test;

public class SwapStringForEquals {
	/*Comments
	 * 1790. Check if One String Swap Can Make Strings Equal
	 * */
	@Test
	public void test1() {
		String s1 = "bank", s2 = "kanb";
		areAlmostEqual(s1,s2);
	}

	private boolean areAlmostEqual(String s1, String s2) {
		 int count=0,tmp1=0,tmp2=0;
	        if(s1.equals(s2)) return true;
	        for(int i=0;i<s1.length();i++){
	            if(s1.charAt(i)==s2.charAt(i)){
	                continue;
	            }else{
	                count++;
	                if(count==1){
	                    tmp1=i;
	                }else if(count==2){
	                    tmp2=i;
	                }else return false;
	            }
	        }
	        char tmpCh=s2.charAt(tmp1);
	        char one =s2.charAt(tmp1);
	        char two =s2.charAt(tmp2);
	        StringBuilder sb=new StringBuilder(s2);
	        sb.setCharAt(tmp1, two);
	        sb.setCharAt(tmp2, one);
	        if(sb.toString().equals(s1)) return true;
	        else return false;
	}
}
