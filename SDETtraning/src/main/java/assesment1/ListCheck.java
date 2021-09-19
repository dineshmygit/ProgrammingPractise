package assesment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCheck {
	
	public static void main(String[] args) {
		int[] arr=new int[3];
		int[] arr1=new int[]{1,2,3,4};
		int count=1;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=count++;
		}
		 Integer a[] = new Integer[] { 10, 20, 30, 40 };
         List<Integer> list = Arrays.asList(a);
         
         list.set(1, 50);
         System.out.println(Arrays.toString(a));
         System.out.println(list);
         List<int[]> ls=Arrays.asList(arr);
      //   ls.add(55);
         
		
		System.out.println(ls);
		
	}

}
