package E_commerce.filter;

import E_commerce.data.FilterDetails;

public class ProductFilterFactory {
    private ProductFilterFactory() {
    }

    public static ProductFilter getProductFilter(FilterDetails filterDetails) {
        ProductFilter filter = new IdleFilter();
        if (filterDetails.getPayOnFilter().isPresent())
            filter = new PayOnDeliveryFilter(filterDetails.getPayOnFilter().get(), filter);
        if (filterDetails.getRatingFilter().isPresent())
            filter = new RatingBasedFilter(filterDetails.getRatingFilter().get(), filter);
        if (filterDetails.getPriceFilter().isPresent())
            filter = new PriceBasedFilter(filterDetails.getPriceFilter().get(), filter);
        return filter;
    }
}
