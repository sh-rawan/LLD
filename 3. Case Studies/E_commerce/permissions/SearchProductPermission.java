package E_commerce.permissions;

import E_commerce.data.User;

public class SearchProductPermission implements Permissions {
    private final User user;

    @Override
    public boolean isPermitted() {
        // check if the user is valid or something else
        if (user.getId() < 0)
            return false;
        return true;
    }

    public SearchProductPermission(User user) {
        this.user = user;
    }

}
