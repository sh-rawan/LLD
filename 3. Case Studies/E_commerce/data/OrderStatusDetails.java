package E_commerce.data;

public class OrderStatusDetails {
    private final OrderStatus orderStatus;
    private final String description;

    public OrderStatusDetails(OrderStatus orderStatus, String description) {
        this.orderStatus = orderStatus;
        this.description = description;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public String getDescription() {
        return description;
    }
}
