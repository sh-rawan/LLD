package ChainOfResponsibility.handlers.enquiry;

import ChainOfResponsibility.data.EnquiryType;

public class IdleHandler implements EnquiryHandler {
    public EnquiryType handle(String enquiry) {
        System.out.println("Inside Idle Handler");
        return EnquiryType.UNKNOWN;
    }
}
