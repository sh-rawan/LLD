package E_commerce.searcher;

import java.util.List;

import E_commerce.data.FilterDetails;
import E_commerce.data.Product;
import E_commerce.db.DBAccessor;
import E_commerce.filter.ProductFilterFactory;

public class ProductSearcher {
    public List<Product> searchProducts(String productName, FilterDetails filterDetails) {
        List<Product> products = DBAccessor.getProductsByName(productName);
        products = ProductFilterFactory.getProductFilter(filterDetails).filter(products);
        return products;
    }
}
