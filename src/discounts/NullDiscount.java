package discounts;

import com.hz.Customer;

public class NullDiscount implements Discount {

    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount) {

        return 0;
    }
}
