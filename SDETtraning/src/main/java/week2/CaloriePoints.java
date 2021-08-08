package week2;

import org.junit.Test;

/*Iterate through the array 
As k=1 cal for each day
get cal for each day and compare with lower and upper
if lower -1 , if upper +1, if same then 0
keep the track of calories and manipulate for each day 
return the calculated calories*/

    
public class CaloriePoints {
	@Test
	public void test1() {
		int[] calories = {1,2,3,4,5};
		int k=1,upper=3,lower=3;
		calorieCalculation(calories,k,upper,lower);

	}
	@Test
	public void test2() {
		int[] calories = {3,2};
		int k=2,upper=1,lower=0;
		calorieCalculation(calories,k,upper,lower);

	}

	public void calorieCalculation(int[] calories, int k, int upper, int lower) {
		int dietPoints=0,result=0;  
		for (int i = 0; i < calories.length; i++) {
			if(calories[i]>upper) {
				dietPoints=-1;
			}else if(calories[i]<lower) {
				dietPoints=1;
			}else {
				dietPoints=0;
			}
			result+=dietPoints;
		}
		System.out.println(result);
	}

}
