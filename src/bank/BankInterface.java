package bank;
import buyers.Buyer;
import sellers.Seller;


public interface BankInterface {
    void addBuyer(Buyer buyer);
    void addSeller(Seller seller);
    void updateInflation(double correction);
}
