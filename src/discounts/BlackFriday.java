package discounts;

import com.hz.Customer;
import products.Product;

// On Black Friday, things go crazy.
// Every customer is awarded a discount equal
// to the number of products in their basket, up to 80% off!

public class BlackFriday implements Discount{

    private int maxDiscount = 80;

    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount) {

        double discount = productCount < maxDiscount
                ? productCount : maxDiscount;

        return discount / 100;
    }
}
