package E_commerce.permissions;

import java.util.Optional;

import E_commerce.data.Order;
import E_commerce.data.User;

public class PermissionFactory {
    private PermissionFactory() {
    }

    public static Optional<Permissions> getSearchPermission(User user) {
        return Optional.of(new SearchProductPermission(user));
    }

    public static Optional<Permissions> getAddToCartPermission(int productId, User user) {
        return Optional.of(new AddToCartPermission());
    }

    public static Optional<Permissions> getTrackOrderPermission(User user, Order order) {
        return Optional.of(new TrackOrderPermission(user, order));
    }
}
