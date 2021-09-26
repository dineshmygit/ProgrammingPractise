package dpworld;

import org.junit.Test;

public class Dpworld {
	public static void main(String args[]){
	    findFactorial(20,3);
	
}
	private static int findFactorial(int n, int k) {
		int kth = 0; //counter to count kth factor
        for(int i = 1; i <= n;i++){
            if(n % i ==  0){
                kth++;
                if(kth == k){ //when we reach till kth factor we simply return it
                    System.out.println(i);
                	return i;
                }
            }
        }
        return 0;
	}
}
