package week4;

public class UnixSystemFile {

	  String str="/a/../b/";
	  char[] ch=str.toCharArray();
	  String[] slpitStr=str.split("/");
	  
}

/*
 * Psuedo Code
 * 
 * 1.Traverse from start to end and push stack 2.Check if the condition is Stack
 * is Empty then add iint o stack and check condition // / Last / Remove it ..
 * Move to parent (Remove .. directory +Parent directory) . Current directory
 * (Remove Current directory) 3.Return stack
 */