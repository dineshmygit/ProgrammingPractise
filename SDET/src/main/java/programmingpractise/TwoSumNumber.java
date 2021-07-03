package programmingpractise;

public class TwoSumNumber {

	public static void main(String[] args) {
         int[] arr= {2,4,6,8,10};
         int value=10,sum=0;
         for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				sum=arr[i]+arr[j];
				if(sum==value) {
					System.out.println(i+","+j);
					break;
				}
				else {
					continue;
				}
			}
		}
	}
}
