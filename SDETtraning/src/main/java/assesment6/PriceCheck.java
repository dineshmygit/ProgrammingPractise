package assesment6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceCheck {
	public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
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
