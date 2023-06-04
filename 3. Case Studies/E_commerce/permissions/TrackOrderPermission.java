package E_commerce.permissions;

import E_commerce.data.Order;
import E_commerce.data.User;

public class TrackOrderPermission implements Permissions {
    private final User user;
    private final Order order;

    public TrackOrderPermission(User user, Order order) {
        this.user = user;
        this.order = order;
    }

    @Override
    public boolean isPermitted() {
        // TODO Auto-generated method stub
        return true;
    }

}
