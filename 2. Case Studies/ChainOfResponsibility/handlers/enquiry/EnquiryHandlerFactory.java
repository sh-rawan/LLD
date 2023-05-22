package ChainOfResponsibility.handlers.enquiry;

public class EnquiryHandlerFactory {
    private EnquiryHandlerFactory() {
    }

    public static EnquiryHandler getEnquiryHandler() {
        return new LogHandler(new AcademicEnquiryHandler(
                new ProjectEnquiryHandler(new SubscriptionEnquiryHandler(new IdleHandler()))));
    }
}
