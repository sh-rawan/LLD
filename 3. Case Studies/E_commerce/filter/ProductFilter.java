package E_commerce.filter;

import java.util.List;

import E_commerce.data.Product;

public interface ProductFilter {
    List<Product> filter(List<Product> products);
}
