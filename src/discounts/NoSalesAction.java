package discounts;

import com.hz.Customer;

// New customers pay full price,
// regular customers enjoy a 15% discount.
public class NoSalesAction implements Discount {

    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount) {

        double discount = 0.0;

        if (customer.isRegular())
            discount = .15;

        return discount;
    }
}
