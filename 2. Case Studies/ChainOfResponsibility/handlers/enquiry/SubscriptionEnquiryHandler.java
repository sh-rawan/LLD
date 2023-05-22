package ChainOfResponsibility.handlers.enquiry;

import ChainOfResponsibility.data.EnquiryType;

public class SubscriptionEnquiryHandler implements EnquiryHandler {
    private final EnquiryHandler nextHandler;

    public SubscriptionEnquiryHandler(EnquiryHandler nexHandler) {
        this.nextHandler = nexHandler;
    }

    public EnquiryType handle(String enquiry) {
        System.out.println("Inside Subscription Enquiry Handler");
        if (enquiry.contains("upgrade") || enquiry.contains("Payment")) {
            return EnquiryType.SUBSCRIPTIONS;
        }
        return this.nextHandler.handle(enquiry);
    }
}
