package assesment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*Given an array of intervals [[1,3],[2,4],[6,9]], 
 * merge the overlapping intervals, i.e to [[1,4],[6,9]]
input:2-Dint[][]
output:2-Dint[][]
 */ 

public class MergeTwoDimentionalArray {
	@Test
	public void test1() {
		int[][] data= {{1,3},{2,3},{5,6}};
		findMergeOverlapValues(data);
	}

	@Test
	public void test2() {
		int[][] data= {{1,3},{1,4},{3,6}};
		findMergeOverlapValues(data);
	}

	@Test
	public void test3() {
		int[][] data= {{1,3},{2,2}};
		findMergeOverlapValues(data);
	}

	/*[[1,2],[2,3],[3,6]]
	 * sort the data based in first index
	 * Then sort by second index
	   create an ArrayList
	 * Iterate through the sorted array 
	 * if(data[i][0]>=tmp[0] && data[i][1]<=tmp[1])
	 */
	private void findMergeOverlapValues(int[][] data) {		
		Arrays.sort(data,(a,b)-> {
			if(a[0]!=b[0]) return a[0]-b[0];
			else return b[1]-a[1];
		});
		int[] tmp= data[0];
		List<int[]> mergedOutput=new ArrayList<int[]>();
		mergedOutput.add(data[0]);
		for (int i = 1; i < data.length; i++) {
			int currentStart=tmp[0];
			int currentEnd=tmp[1];
			int nextStart=data[i][0];
			int nextEnd=data[i][1];
			int[] tmpValues=new int[2];
			if(currentEnd>=nextStart) {
				tmp[1]=Math.max(currentEnd, nextEnd);
			}else {
				//[1,3][2,3]
				tmpValues[0]=currentStart;
				tmpValues[1]=currentEnd;
				tmp=data[i];
				mergedOutput.add(tmp);
			}
		}
		System.out.println(Arrays.deepToString(mergedOutput.toArray(new int[mergedOutput.size()] [])));
	}
}