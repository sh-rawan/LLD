package E_commerce.filter;

import java.util.ArrayList;
import java.util.List;

import E_commerce.data.Product;
import E_commerce.data.Rating;

public class RatingBasedFilter implements ProductFilter {
    private final Rating minRating;
    private final ProductFilter nextFilter;

    public RatingBasedFilter(Rating minRating, ProductFilter nextFilter) {
        this.minRating = minRating;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getRating().getVal() >= minRating.getVal()) {
                filteProducts.add(product);
            }
        }
        List<Product> finalProducts = nextFilter.filter(filteProducts);
        return finalProducts;
    }

}
