package E_commerce.filter;

import java.util.ArrayList;
import java.util.List;

import E_commerce.data.Product;

public class PriceBasedFilter implements ProductFilter {
    private final double priceUpperCapFilter;
    private final ProductFilter nextFilter;

    public PriceBasedFilter(double priceUpperCapFilter, ProductFilter nextFilter) {
        this.priceUpperCapFilter = priceUpperCapFilter;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPriceInINR() <= priceUpperCapFilter) {
                filteProducts.add(product);
            }
        }
        List<Product> finalProducts = nextFilter.filter(filteProducts);
        return finalProducts;
    }

}
