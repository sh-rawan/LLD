package E_commerce.notifiers;

public class WhatsAppSubscriber implements Subscriber {
    private final String number;

    public WhatsAppSubscriber(String number) {
        this.number = number;
    }

    @Override
    public void notify(String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notify'");
    }
}
