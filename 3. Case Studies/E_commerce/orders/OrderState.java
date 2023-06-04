package E_commerce.orders;

import E_commerce.data.DeliveryDetails;
import E_commerce.data.OrderStatusDetails;
import E_commerce.data.PickupDetails;
import E_commerce.data.TransitDetails;

public interface OrderState {
    void schedulePickup(PickupDetails pickupDetails);

    void pickUp();

    void endTransit(TransitDetails transitDetails);

    void scheduleDelivery(DeliveryDetails deliveryDetails);

    void delivery();

    void cancel();

    OrderStatusDetails getStatus();
}
