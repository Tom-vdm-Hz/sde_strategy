package com.hz;

import discounts.DiscountFactory;
import discounts.Discount;
import products.*;

public class Main {

    // Main scenario
    public static void main(String[] args) {

        // There is a shop with a checkout
        Checkout kassa5 = new Checkout();

        Discount discount = DiscountFactory.getDiscountBySalesAction(SalesAction.NoAction);
        kassa5.setDiscountStrategy(discount);

        // Two customers enter the shop
        Customer piet = new Customer(CustomerType.Regular, "Piet");
        Customer anne = new Customer(CustomerType.New, "Anne");

        // buying stuff
        piet.buys(new CuteTeddyBear());
        piet.buys(new CuteTeddyBear());

        anne.buys(new CuteTeddyBear());
        anne.buys(new CuteTeddyBear());

        // and proceed to checkout
        kassa5.nextInLine(piet);
        kassa5.nextInLine(anne);
    }
}
