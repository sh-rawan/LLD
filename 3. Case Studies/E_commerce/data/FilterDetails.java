package E_commerce.data;

import java.util.Optional;

public class FilterDetails {
    private final Optional<Double> priceFilter;
    private final Optional<Rating> ratingFilter;
    private final Optional<Boolean> payOnFilter;

    public FilterDetails(Optional<Double> priceFilter, Optional<Rating> ratingFilter, Optional<Boolean> payOnFilter) {
        this.priceFilter = priceFilter;
        this.ratingFilter = ratingFilter;
        this.payOnFilter = payOnFilter;
    }

    public Optional<Double> getPriceFilter() {
        return priceFilter;
    }

    public Optional<Rating> getRatingFilter() {
        return ratingFilter;
    }

    public Optional<Boolean> getPayOnFilter() {
        return payOnFilter;
    }

}
