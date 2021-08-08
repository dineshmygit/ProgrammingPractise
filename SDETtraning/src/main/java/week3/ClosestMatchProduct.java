package week3;

public class ClosestMatchProduct {

	//test data understanding
	//
	public void test1() {
		int[] arr= {1,2,3,4,5};
		int target=20;
		int[] resultIndex=findingClosestProduct(arr,target);
	}

	private int[] findingClosestProduct(int[] data, int target) {
		int left=0,right=1,nearestIndex=0;
		while(left<right) {
			int product=data[left]*data[right];
			if(product==target) return new int[] {left,right};
			else if(product <target) {
				right++;
				nearestIndex=Math.min(nearestIndex, product);
			}
		}
		return null;
	}

	

}
