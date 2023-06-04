package E_commerce.data;

import E_commerce.orders.OrderState;

public class Order {
    private final int id;
    private final Cart cart;
    private final Address shippinAddress;
    private final Address billiAddress;

    public OrderState getOrderState() {
        return orderState;
    }

    public int getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }

    public Address getShippinAddress() {
        return shippinAddress;
    }

    public Address getBilliAddress() {
        return billiAddress;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    private OrderState orderState;

    public Order(int id, Cart cart, Address shippinAddress, Address billiAddress) {
        this.id = id;
        this.cart = cart;
        this.shippinAddress = shippinAddress;
        this.billiAddress = billiAddress;
    }

    public void cancel() {
        this.orderState.cancel();
    }

    public void delivery() {
        this.orderState.delivery();
    }

    public void endTransit(TransitDetails transitDetails) {
        this.orderState.endTransit(transitDetails);
    }

    public OrderStatusDetails getStatus() {
        this.orderState.getStatus();
        return null;
    }

    public void pickUp() {
        this.orderState.pickUp();
    }

    public void scheduleDelivery(DeliveryDetails deliveryDetails) {
        this.orderState.scheduleDelivery(deliveryDetails);
    }

    public void schedulePickup(PickupDetails pickupDetails) {
        this.orderState.schedulePickup(pickupDetails);
    }

}
