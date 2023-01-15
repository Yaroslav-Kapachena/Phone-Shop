package com.example.logic;

import com.example.entty.Phone;

public class MainLogic {
    public static void main(String[] args) {
        BuyerLogic buyerLogic = new BuyerLogic();
        Phone phone = new Phone();
        phone.setModel("ggdgh444");
        Buyer buyer = new Buyer();
        buyer.setName("hdbcjhcb");
        buyerLogic.buy(phone,buyer);
    }
}
