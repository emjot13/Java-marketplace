package products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


public class Product {
    private String name;
    private double productionCost;
    public Product(String name, double productionCost){
        this.name = name;
        this.productionCost = productionCost;
    }

}

