package assesment6;

import org.junit.Test;

public class LargestString {
	/*Comments*/
	@Test
	public void test1() {
		String str= "zzzzza";
		int k=2;
		findLargestString(str,k);
	}
	private void findLargestString(String str, int k) {
		int[] charA= new int[26];
		String data="";
		for (int i = 0; i < str.length(); i++) {
			charA[str.charAt(i)-'a']++;
		}
		//zzzzzv - zzyzzyz
		//z=5
		//y=1
		for (int i = charA.length-1; i >= 0;) {
			if(charA[i]>k) {
				int count=0;
				while(count<k) {//zzyzz
					data+=((char)(i+'a'));
					count++;
				}
				charA[i]-=k;//z=1
				int j =0;
				for (j =i-1 ; j > 0;) {
					if(charA[j]<=0) {
						j--;
					}
				}
				if(charA[j]>0) {
					data+=((char)(j+'a'));
					charA[j]--;
				}else break;
			}else if(charA[i]>0) {
				int count=charA[i];
				while(count>0) {
					data+=((char)(i+'a'));
					count--;
				}
				charA[i]=0;
			}else i--;
		}
		System.out.println(data);
	}
}
