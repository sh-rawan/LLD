package ChainOfResponsibility.handlers.enquiry;

import ChainOfResponsibility.data.EnquiryType;

public class AcademicEnquiryHandler implements EnquiryHandler {
    private final EnquiryHandler nextHandler;

    public AcademicEnquiryHandler(EnquiryHandler nexHandler) {
        this.nextHandler = nexHandler;
    }

    public EnquiryType handle(String enquiry) {
        System.out.println("Inside Academic Enquiry Handler");
        if (enquiry.contains("DS Algo") || enquiry.contains("Design")) {
            return EnquiryType.ACADEMIC;
        }
        return this.nextHandler.handle(enquiry);
    }
}
