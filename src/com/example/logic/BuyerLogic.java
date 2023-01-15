package com.example.logic;

import com.example.entty.Phone;

public class BuyerLogic {
    public void buy(Phone phone, Buyer buyer) {
        System.out.println(  buyer.getName() + " купил " + phone.getModel());
    }
}
