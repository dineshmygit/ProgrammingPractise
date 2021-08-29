package assesment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class PriceCheck {

	@Test
	public void test1() {
		String[] product= {"milk","cheese","bread"};
		float[] pPrice= {11.5f,12.6f,13.7f};
		String[] sold= {"milk","cheese","bread","milk"};
		float[] sPrice= {11.3f,12.6f,13.7f,12.00f};
		findPriceMatch(product,pPrice,sold,sPrice);
	}
	@Test
	public void test2() {
		List<String> products = Arrays.asList("tomato", "chocolate", "cheese");
		List<Integer> productPrices = Arrays.asList(10, 10, 30);
		List<String> productSold = Arrays.asList("tomato", "chocolate", "cheese");
		List<Integer> soldPrice = Arrays.asList(10,20,30);
//		Assert.assertEquals(1, findError(products, productPrices, productSold, soldPrice));
	}
	
	@Test
	public void test3() {
		List<String> products = Arrays.asList("egg", "milk");
		List<Integer> productPrices = Arrays.asList(33, 44);
		List<String> productSold = Arrays.asList("egg", "milk", "egg");
		List<Integer> soldPrice = Arrays.asList(11, 42, 22);
//		Assert.assertEquals(3, findError(products, productPrices, productSold, soldPrice));
	}
	
	@Test
	public void test4() {
		List<String> products = Arrays.asList("egg", "milk");
		List<Integer> productPrices = Arrays.asList(33, 44);
		List<String> productSold = Arrays.asList("egg", "milk", "milk");
		List<Integer> soldPrice = Arrays.asList(11, 32, 22);
//		Assert.assertEquals(3, findError(products, productPrices, productSold, soldPrice));
	}
	private void findPriceMatch(String[] product, float[] pPrice, String[] sold, float[] sPrice) {
		Map<String,Float> map=new HashMap<String,Float>();
		int count=0;
		for (int i = 0; i < product.length; i++) {
			map.put(product[i],pPrice[i]);
		}
		System.out.println(map);
		for (int i = 0; i < sPrice.length; i++) {
			if(map.containsKey(sold[i])) {
				if(!(map.get(sold[i])==sPrice[i])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public int findError(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
		HashMap<String,ArrayList<Float>> map = new HashMap<String,ArrayList<Float>>();
		for(int i=0;i<productSold.size();i++){
			String pSold = productSold.get(i);
			if(map.containsKey(pSold)){
				ArrayList<Float> list = map.get(pSold);
				list.add(soldPrice.get(i));
				map.put(pSold, list);
			}
			else{
				ArrayList<Float> list = new ArrayList<Float>();
				list.add(soldPrice.get(i));
				map.put(pSold,list);
			}
		}
		HashMap<String,Float> map2 = new HashMap<String,Float>();  
		for(int i=0;i<products.size();i++){
			map2.put(products.get(i), productPrices.get(i));
		}

		int error = 0;
		for(Map.Entry<String,Float> map3:map2.entrySet()){
			String pName = map3.getKey();
			Float pCost = map3.getValue();
			if(map.containsKey(pName)){
				ArrayList<Float> price = map.get(pName);
				for(int i=0;i<price.size();i++){
					Float  sCost = price.get(i);
					if(pCost-sCost!=0.0)
						error++;
				}
			}
		}
		return error;
	}
}
