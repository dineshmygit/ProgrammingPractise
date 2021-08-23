package mypractise;

import org.junit.Test;

public class StringCheck {
	
	@Test
	public void stringCheckMethod() {
		String str="Dinesh";
		String obj=new String("Dinesh");
		findRef(str,obj);
	}
	private void findRef(String str, String obj) {
		if(str==obj) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
