package ChainOfResponsibility.handlers;

import ChainOfResponsibility.data.Request;

public class IdleHandler implements RequestHandler {
    public void handle(Request request) {
        System.out.println("All done");
    }
}
