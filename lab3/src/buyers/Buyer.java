package buyers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import products.Product;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


@Getter
@Setter
@ToString


public class Buyer {
    private HashMap<Product, List<Double>> desirabilityMap;
    private String name;
    public Buyer(String name, HashMap<Product, List<Double>> desirabilityMap){
        this.name = name;
        this.desirabilityMap = desirabilityMap;
    }

    public void buyProduct(){
        for (Entry<Product, List<Double>> entry : desirabilityMap.entrySet()){
            System.out.println(entry.getKey().getName() + "=" + entry.getValue());
        }
    }


    public static void main(String[] args){
        Buyer dudek = new Buyer("dudek", new HashMap<>() {{
            put(new Product(2.89, 50, "perła export"), Arrays.asList(0.0, 0.5, 0.8));}}
        );
        dudek.buyProduct();

}
}