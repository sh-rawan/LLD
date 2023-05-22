package LoggerSystem.subcriber;

public class FileSubscriber implements Subscriber {
    @Override
    public void update(String message) {
        System.out.println("Writing to file :" + message);
    }
}
