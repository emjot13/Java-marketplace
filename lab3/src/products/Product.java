package products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


public class Product {
    private double price;
    private int productID;
    private String name;

    public Product(double price, int productID, String name){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

}

