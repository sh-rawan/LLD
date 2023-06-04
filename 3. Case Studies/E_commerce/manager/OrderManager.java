package E_commerce.manager;

import E_commerce.data.Address;
import E_commerce.data.Cart;
import E_commerce.data.Order;
import E_commerce.data.User;
import E_commerce.payments.PaymentProcessor;

public class OrderManager {
    private final CartManager cartManager;

    public OrderManager(CartManager cartManager) {
        this.cartManager = cartManager;
    }

    public Order placeOrder(User user, PaymentProcessor paymentProcessor, Address shippingAddress,
            Address billingAddress) {
        Cart cart = cartManager.getCart(user);
        if (cart.getCartAmount() != paymentProcessor.getPayableAmount())
            throw new RuntimeException("Invalid amount!");
        if (!paymentProcessor.processPayment())
            throw new RuntimeException("Payment failed");
        Order order = new Order(getOrderId(), cart, shippingAddress, billingAddress);
        cartManager.checkoutCart(user, order);
        return order;
    }

    private int getOrderId() {
        return 0;
    }
}
