package main;
import buyers.Buyer;
import products.Product;
import sellers.Seller;
import bank.Bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Main {




    public static void main(String[] args){
        List<Product> desiredProducts = new ArrayList<>(Arrays.asList(new Product("piwo", 1.80), new Product("wódka", 15.0)));
        Buyer buyer1 = new Buyer(desiredProducts);
        Seller seller1 = new Seller(0.2, Arrays.asList(new Product("piwo", 1.80), new Product("wódka", 15.0)), 5);
        List<Buyer> buyerList = List.of(buyer1);
        List<Seller> sellerList = List.of(seller1);
        Bank bank = new Bank(0.1, buyerList, sellerList);
//        System.out.printf("%s, %s %n",seller1.getProductsQuantity(), buyer1.getDesirabilityMap());
        System.out.println(seller1);
        for (Buyer buyer : buyerList){
            buyer.buyProduct(sellerList);
        }
        bank.updateInflation(0.1);
        seller1.calculatePriceMap();
        System.out.println(seller1);



    }
}
