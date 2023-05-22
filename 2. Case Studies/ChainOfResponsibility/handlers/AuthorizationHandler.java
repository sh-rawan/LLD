package ChainOfResponsibility.handlers;

import ChainOfResponsibility.data.Request;
import ChainOfResponsibility.managers.UserManager;

public class AuthorizationHandler implements RequestHandler {
    private final RequestHandler nextHandler;
    private final UserManager userManager;

    public AuthorizationHandler(RequestHandler nextHandler, UserManager userManager) {
        this.nextHandler = nextHandler;
        this.userManager = userManager;
    }

    public void handle(Request request) {
        if (!this.userManager.isSubscribed(request.getToken()))
            throw new RuntimeException("Authorization failed.");
        System.out.println("Authorization passed.");
        this.nextHandler.handle(request);
    }
}
