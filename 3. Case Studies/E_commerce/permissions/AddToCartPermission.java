package E_commerce.permissions;

public class AddToCartPermission implements Permissions {

    @Override
    public boolean isPermitted() {
        // Apply all the if checks like cart amount is less than 4 lakh;
        return true;
    }

}
