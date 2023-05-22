package ChainOfResponsibility;

import ChainOfResponsibility.apis.HandleEnquiryApi;
import ChainOfResponsibility.data.Request;
import ChainOfResponsibility.handlers.RequestHAndlerFactory;

public class Main {
    public static void main(String[] args) {
        RequestHAndlerFactory.getHandler("playVideo").handle(new Request("abc", "def", "ghi"));

        System.out.println();
        System.out.println();
        new HandleEnquiryApi().handleEnquiry("I want to upgrade for 1 month.");
    }
}
