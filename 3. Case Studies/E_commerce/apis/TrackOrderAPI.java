package E_commerce.apis;

import java.util.Optional;

import E_commerce.data.Order;
import E_commerce.data.OrderStatusDetails;
import E_commerce.data.User;
import E_commerce.db.DBAccessor;
import E_commerce.permissions.PermissionFactory;
import E_commerce.permissions.Permissions;

public class TrackOrderAPI {
    public OrderStatusDetails trackOrder(int orderId, User user) {
        Order order = DBAccessor.getOrderById(orderId);
        if (order == null)
            throw new RuntimeException("Unable to fetch");
        Optional<Permissions> permission = PermissionFactory.getTrackOrderPermission(user, order);
        if (permission.isEmpty() || !permission.get().isPermitted())
            throw new RuntimeException("Not allowed");
        return order.getStatus();
    }
}
