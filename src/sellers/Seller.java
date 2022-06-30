package sellers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import products.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString

public class Seller {
    private List<Product> products;
    private HashMap<String, Double> priceMap = new HashMap<>();
    private HashMap<String, Integer> productsQuantity = new HashMap<>();
    private double profitMargin;
    private double inflationRate;

    public Seller(double profitMargin, List<Product> products, int maxNumberOfProduct) {
        this.profitMargin = profitMargin;
        this.products = products;
        calculatePriceMap();
        generateNumberOfProducts(maxNumberOfProduct);
    }


    public void calculatePriceMap() {
        for (Product product : products) {
            double baseCost = product.getProductionCost();
            double costBeforeInflation = baseCost + product.getProductionCost() * profitMargin;
            double finalCost = costBeforeInflation + costBeforeInflation * inflationRate;
            priceMap.put(product.getName(), finalCost);
        }
    }

    public void generateNumberOfProducts(int maxNumberOfProducts) {
        for (Product product : products){
            Random random = new Random();
            productsQuantity.put(product.getName(), random.nextInt(maxNumberOfProducts) + 1);
        }
    }


}
