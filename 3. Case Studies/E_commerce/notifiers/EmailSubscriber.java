package E_commerce.notifiers;

public class EmailSubscriber implements Subscriber {
    private final String email;

    @Override
    public void notify(String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notify'");
    }

    public EmailSubscriber(String email) {
        this.email = email;
    }

}
