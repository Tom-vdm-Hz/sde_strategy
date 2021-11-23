package discounts;

import com.hz.Customer;
import products.Product;

public interface Discount {

    double getDiscount(Customer customer, int productIndex, int productCount);
}
