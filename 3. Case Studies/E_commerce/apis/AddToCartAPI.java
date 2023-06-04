package E_commerce.apis;

import java.util.Optional;

import E_commerce.data.ProductCopy;
import E_commerce.data.User;
import E_commerce.db.DBAccessor;
import E_commerce.manager.CartManager;
import E_commerce.permissions.PermissionFactory;
import E_commerce.permissions.Permissions;

public class AddToCartAPI {
    private final CartManager cartManager;

    public AddToCartAPI(CartManager cartManager) {
        this.cartManager = cartManager;
    }

    public void addToCart(int productId, User user) {
        ProductCopy productCopy = DBAccessor.getProductCopy(productId);
        if (productCopy == null)
            throw new IllegalArgumentException("Invalid prod id");
        Optional<Permissions> permission = PermissionFactory.getAddToCartPermission(productId, user);
        if (permission.isEmpty() || !permission.get().isPermitted())
            throw new RuntimeException("Not allowed");
        cartManager.addToCart(user, productCopy);
    }
}
