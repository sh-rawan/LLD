package ChainOfResponsibility.handlers.enquiry;

import ChainOfResponsibility.data.EnquiryType;

public class ProjectEnquiryHandler implements EnquiryHandler {
    private final EnquiryHandler nextHandler;

    public ProjectEnquiryHandler(EnquiryHandler nexHandler) {
        this.nextHandler = nexHandler;
    }

    public EnquiryType handle(String enquiry) {
        System.out.println("Inside Project Enquiry Handler");
        if (enquiry.contains("Project")) {
            return EnquiryType.PROJECTS;
        }
        return this.nextHandler.handle(enquiry);
    }
}
