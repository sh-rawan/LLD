package E_commerce.orders;

import E_commerce.data.DeliveryDetails;
import E_commerce.data.OrderStatusDetails;
import E_commerce.data.PickupDetails;
import E_commerce.data.TransitDetails;

public class PickupScheduledState implements OrderState {

    @Override
    public void cancel() {
        // TODO Auto-generated method stub

    }

    @Override
    public void delivery() {
        // TODO Auto-generated method stub

    }

    @Override
    public void endTransit(TransitDetails transitDetails) {
        // TODO Auto-generated method stub

    }

    @Override
    public OrderStatusDetails getStatus() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void pickUp() {
        // TODO Auto-generated method stub

    }

    @Override
    public void scheduleDelivery(DeliveryDetails deliveryDetails) {
        // TODO Auto-generated method stub

    }

    @Override
    public void schedulePickup(PickupDetails pickupDetails) {
        // TODO Auto-generated method stub

    }

}
