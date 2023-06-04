package E_commerce.db;

import java.util.List;

import E_commerce.data.Cart;
import E_commerce.data.Order;
import E_commerce.data.Product;
import E_commerce.data.ProductCopy;
import E_commerce.data.User;

public class DBAccessor {
    private DBAccessor() {
    }

    public static List<Product> getProductsByName(String productName) {
        return null;
    }

    public static ProductCopy getProductCopy(int productId) {
        return null;
    }

    public static Cart getCart(User user) {
        return null;
    }

    public static void persistCart(Cart cart, User user) {
    }

    public static void checkoutCart(User user, Order order) {
    }

    public static Order getOrderById(int id) {
        return null;
    }
}
