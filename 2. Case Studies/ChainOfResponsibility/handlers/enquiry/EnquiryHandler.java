package ChainOfResponsibility.handlers.enquiry;

import ChainOfResponsibility.data.EnquiryType;

public interface EnquiryHandler {
    EnquiryType handle(String enquiry);
}
