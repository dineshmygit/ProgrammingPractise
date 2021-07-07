package mypractise;

import org.junit.Test;

public class HashMapPractise {

	@Test
	public void internals() {
		String text= "dinesh";
		System.out.println(text.hashCode());
		int hashCode= text.hashCode();
		int n=32;
		//to Get the hashMap index
		int index=hashCode & (n-1);
		System.out.println(index);
		
	}

}
