package com.hz;

import discounts.Discount;
import discounts.DiscountFactory;
import discounts.NoSalesAction;
import discounts.NullDiscount;

public class Checkout {

    public void setDiscountStrategy(Discount discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    private Discount discountStrategy;

    public Checkout() {

        this.discountStrategy = DiscountFactory.getDefaultDiscount();
    }

    public void nextInLine(Customer customer) {

        // init checkout

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discountStrategy);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
