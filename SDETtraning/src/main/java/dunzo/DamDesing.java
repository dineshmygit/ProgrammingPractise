package dunzo;

import org.junit.Test;

public class DamDesing {
/*Comments*/
@Test
public void test1() {
	int[] stickPositions= {1,2,4,7};
	int[] stickHeights= {4,6,8,11};
	maxHeight(stickPositions,stickHeights);
}

public int maxHeight(int[] stickPositions, int[] stickHeights) {
    int n = stickPositions.length;
    int m = stickHeights.length;
    int max = 0;

    for (int i=0; i<n-1; i++) {
        if (stickPositions[i]<stickPositions[i+1]-1) {
            // We have a gap
            int heightDiff =  Math.abs(stickHeights[i+1] - stickHeights[i]);
            int gapLen = stickPositions[i+1] - stickPositions[i] - 1;
            int localMax = 0;
            if (gapLen > heightDiff) {
                int low = Math.max(stickHeights[i+1], stickHeights[i]) + 1;
                int remainingGap = gapLen - heightDiff - 1;
                localMax = low + remainingGap/2;

            } else {
                localMax = Math.min(stickHeights[i+1], stickHeights[i]) + gapLen;
            }

            max = Math.max(max, localMax);
        }
    }
    System.out.println(max);
    return max;
}
}
