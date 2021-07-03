package programmingpractise;

/*       Did I understand the problem? Yes or No !! 
	     * -> If No, Ask the person to provide more detail with example(s) 
	     * -> If yes, go to next step ! 
	     *    What is the input(s)?  
	     *    int i=12345;
	        	//00000
	        	//22222
		        //1-2345 -> wrong
	     *    What is the expected output?   
	     *    Do I have constraints to solve the problem?  
	     *    Do I have all information to go to next step!! 
	     *    How big is your test data set will be?*/ 
public class ReverseNumber {

	public static void main(String[] args) {
		int i=12345;
		//00000
		//22222
		//1-2345 -> wrong
		int rem=0,quo=1,rev=0;
		while(i>0) {
			rem=i%10;
			rev=rev*10+rem;
			quo=i/10;
			i=quo;
		}
		System.out.println(rev);
	}
}
