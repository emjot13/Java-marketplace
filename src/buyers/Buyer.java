package buyers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import products.Product;


import java.util.*;

import sellers.Seller;

@Getter
@Setter
@ToString


public class Buyer {
    private List<Product> desiredProductsList;
    private double inflationRate;
    private HashMap<String, Integer> desirabilityMap = new HashMap<>();
    private HashMap<String, Double> previousPriceMap = new HashMap<>();

    public Buyer(List<Product> desiredProductsList){
        this.desiredProductsList = desiredProductsList;
        initializeDesirabilityMap();
    }

    public void initializeDesirabilityMap(){
        for (Product product : desiredProductsList){
            Random random = new Random();
            desirabilityMap.put(product.getName(), random.nextInt(50));
        }
    }


    public void buyProduct(List<Seller> availableSellers){
    List<Product> copy = new ArrayList<>(desiredProductsList);
     for (Product product : copy){
         boolean foundProduct = false;
         String productName = product.getName();
         for (Seller seller : availableSellers){
             if (seller.getPriceMap().containsKey(productName)){
                 if (seller.getProductsQuantity().get(productName) > 0){
                 foundProduct = true;
                 if (desirabilityMap.get(productName) > 50) {
                 seller.getProductsQuantity().put(productName, seller.getProductsQuantity().get(productName) - 1);
                 desiredProductsList.remove(product);
                 }
                 if (previousPriceMap.get(productName) > seller.getPriceMap().get(productName)) {
                     desirabilityMap.put(productName, Math.max(desirabilityMap.get(productName) + 2, 100));
                 }else{
                     desirabilityMap.put(productName, Math.min(desirabilityMap.get(productName) - 2, 100));
                 }

         }
     }
     }
         if (!foundProduct){
             desirabilityMap.put(productName, Math.max(5, 100));
         }
    }

}
}