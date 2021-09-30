package leetcodehashing;

import java.util.StringTokenizer;

public class StringObjectCreation {

	public static void main(String[] args) {
		String str1 = "automate";
		String str2 = "automate";
		String str3 = new String("automate");
		String str4 = new String("automate");
		if(str1==str3) {
			//System.out.println("true");
		}
		StringTokenizer st=new StringTokenizer("my name is dinesh");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringBuffer sBuffer=new StringBuffer("dinesh");
		StringBuilder sBuilder=new StringBuilder("kumar");
		sBuffer.append("main");
		sBuilder.append("main");
		//System.out.println(sBuffer);
		//System.out.println(sBuilder);
	}
}
