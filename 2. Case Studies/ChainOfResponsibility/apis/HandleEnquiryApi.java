package ChainOfResponsibility.apis;

import ChainOfResponsibility.data.Response;
import ChainOfResponsibility.handlers.enquiry.EnquiryHandlerFactory;

public class HandleEnquiryApi {
    public Response handleEnquiry(String enquiry) {
        EnquiryHandlerFactory.getEnquiryHandler().handle(enquiry);
        return null;
    }
}
