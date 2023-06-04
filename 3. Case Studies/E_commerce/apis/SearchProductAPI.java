package E_commerce.apis;

import java.util.List;
import java.util.Optional;

import E_commerce.data.FilterDetails;
import E_commerce.data.Product;
import E_commerce.data.User;
import E_commerce.permissions.PermissionFactory;
import E_commerce.permissions.Permissions;
import E_commerce.searcher.ProductSearcher;

public class SearchProductAPI {
    private final ProductSearcher productSearcher;

    public SearchProductAPI(ProductSearcher productSearcher) {
        this.productSearcher = productSearcher;
    }

    public List<Product> search(String productName, FilterDetails filterDetails, User user) {
        Optional<Permissions> permission = PermissionFactory.getSearchPermission(user);
        if (permission.isEmpty() || !permission.get().isPermitted())
            throw new RuntimeException("User not permitted");
        return productSearcher.searchProducts(productName, filterDetails);
    }
}
