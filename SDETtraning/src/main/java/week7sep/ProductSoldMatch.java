package week7sep;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ProductSoldMatch {
	/*Comments*/
	@Test
	public void test1() {
		String[] soldItems= {"eggs", "milk", "apple"};
		double[] soldPrices= {1.00, 2.50, 2.1};
		String[] productsAvailable= {"eggs","lemons", "milk", "apple"};
		double[] productPrices = {1.01, 0.5, 2.50, 2.1};
		findProductMatch(soldItems,soldPrices,productsAvailable,productPrices);

	}

	private void findProductMatch(String[] soldItems, double[] soldPrices, String[] productsAvailable,
			double[] productPrices) {
		int count=0;
		Map<String,Double> map=new HashMap<String,Double>();
		for (int j = 0; j < productsAvailable.length; j++)
			map.put(productsAvailable[j], productPrices[j]);
		for (int i = 0; i < soldItems.length; i++) {
			if(!map.containsValue(soldPrices[i])) count++;
		}
		System.out.println(count);
	}
}
