package E_commerce.data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cart {
    private final int id;
    private final List<ProductCopy> products;

    public Cart(int id, List<ProductCopy> products) {
        this.id = id;
        this.products = products;
    }

    public void add(ProductCopy productCopy) {
        this.products.add(productCopy);
    }

    public void remove(ProductCopy productCopy) {
        if (!this.products.contains(productCopy))
            throw new RuntimeException("Not allowed");
        this.products.remove(productCopy);
    }

    public int getId() {
        return id;
    }

    public double getCartAmount() {
        double amount = 0;
        for (ProductCopy productCopy : products) {
            amount += productCopy.getProduct().getPriceInINR();
        }
        return amount;
    }

    public int getDistinctItemsCount() {
        Set<Integer> distinctIds = new HashSet<>();
        for (ProductCopy productCopy : products) {
            distinctIds.add(productCopy.getProduct().getId());
        }
        return distinctIds.size();
    }
}
