package bank;
import buyers.Buyer;
import sellers.Seller;

import java.util.List;

public class Bank implements BankInterface {
    private double inflationRate;
    private List<Buyer> buyersList;
    private List<Seller> sellersList;


    public Bank(double inflationRate, List<Buyer> buyersList, List<Seller> sellersList) {
        this.inflationRate = inflationRate;
        this.buyersList = buyersList;
        this.sellersList = sellersList;
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyersList.add(buyer);
    }

    @Override
    public void addSeller(Seller seller) {
        sellersList.add(seller);
    }

    @Override
    public void updateInflation(double correction) {
        inflationRate += correction;
        for (Buyer buyer : buyersList){
            buyer.setInflationRate(inflationRate);
        }
        for (Seller seller : sellersList){
            seller.setInflationRate(inflationRate);
        }
    }
}
