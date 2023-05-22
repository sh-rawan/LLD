package ChainOfResponsibility.handlers.enquiry;

import ChainOfResponsibility.data.EnquiryType;

public class LogHandler implements EnquiryHandler {
    private final EnquiryHandler nextHandler;

    public LogHandler(EnquiryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public EnquiryType handle(String enquiry) {
        System.out.println(enquiry);
        EnquiryType enquiryType = this.nextHandler.handle(enquiry);
        System.out.println("Inside log handler");
        System.out.println(enquiryType);
        return enquiryType;
    }
}
