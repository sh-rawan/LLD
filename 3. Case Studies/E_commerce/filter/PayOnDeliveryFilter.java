package E_commerce.filter;

import java.util.ArrayList;
import java.util.List;

import E_commerce.data.Product;

public class PayOnDeliveryFilter implements ProductFilter {
    private final boolean isPayOnDelivery;
    private final ProductFilter nextFilter;

    public PayOnDeliveryFilter(boolean isPayOnDelivery, ProductFilter nextFilter) {
        this.isPayOnDelivery = isPayOnDelivery;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.isPayOnDelivery() == isPayOnDelivery) {
                filteProducts.add(product);
            }
        }
        List<Product> finalProducts = nextFilter.filter(filteProducts);
        return finalProducts;
    }

}
