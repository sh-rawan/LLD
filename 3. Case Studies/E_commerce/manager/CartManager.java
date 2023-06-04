package E_commerce.manager;

import E_commerce.data.Cart;
import E_commerce.data.Order;
import E_commerce.data.ProductCopy;
import E_commerce.data.User;
import E_commerce.db.DBAccessor;

public class CartManager {
    public Cart getCart(User user) {
        return DBAccessor.getCart(user);
    }

    public void addToCart(User user, ProductCopy productCopy) {
        if (productCopy.isSold())
            throw new RuntimeException();
        Cart cart = getCart(user);
        cart.add(productCopy);
        DBAccessor.persistCart(cart, user);
    }

    public void removeFromCart(User user, ProductCopy productCopy) {
        if (productCopy.isSold())
            throw new RuntimeException();
        Cart cart = getCart(user);
        cart.remove(productCopy);
        DBAccessor.persistCart(cart, user);
    }

    public void checkoutCart(User user, Order order) {
        DBAccessor.checkoutCart(user, order);
    }
}
