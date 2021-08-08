package week5;

import java.util.ArrayDeque;

import org.junit.Test;

public class LinearAddingEvenOdd {
	@Test
    public void test4() {
        int[] data = {1,3,5,7,2,4,6,8};
        // {1,2,3,4,5,6,7,8}
          System.out.println(lineantNums(data));   
    }
    @Test
    public void test5() {
        int[] data = {1,2,3,4,11,12,13,14};
        // {1,11,2,12,3,13,4,14}
        System.out.println(lineantNums(data));
    }
    private String lineantNums(int[] data) {
        ArrayDeque<Integer> result = new ArrayDeque<Integer>();
        int left =0, right =data.length/2;
         while(right<data.length) {
             result.offer(data[left++]);
             result.offer(data[right++]);
         }
        return result.toString();  
    }
}
