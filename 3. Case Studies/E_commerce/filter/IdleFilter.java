package E_commerce.filter;

import java.util.List;

import E_commerce.data.Product;

public class IdleFilter implements ProductFilter {

    @Override
    public List<Product> filter(List<Product> products) {
        return products;
    }

}
