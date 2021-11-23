package discounts;

import com.hz.Customer;

// On December 24th, every customer is granted
// 20% discount on the first product
// and 12.5% on the other products
public class ChristmasEve implements Discount {

    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount) {

        double discount = 0.0;

        boolean isFirstProduct = productIndex == 0;

        if (isFirstProduct)
            discount = .20;
        else
            discount = .125;

        return discount;
    }
}
