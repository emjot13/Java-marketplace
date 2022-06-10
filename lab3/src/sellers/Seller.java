package sellers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import products.Product;

@Getter
@Setter
@ToString

public class Seller {
    private Product product;
    private int productsNumber;
    private double productionCost;
    private String name;
    private int id;
    private double profitMargin;
    public Seller(String name, int id, double productionCost, int productsNumber, double profitMargin, Product product) {
        this.name = name;
        this.id = id;
        this.productionCost = productionCost;
        this.productsNumber = productsNumber;
        this.profitMargin = profitMargin;
        this.product = product;
    }
}
