package ChainOfResponsibility.handlers;

import ChainOfResponsibility.data.Request;
import ChainOfResponsibility.managers.TokenManager;

public class AuthenticationHandler implements RequestHandler {
    private final RequestHandler nextHandler;
    private final TokenManager tokenManager;

    public AuthenticationHandler(RequestHandler nextHandler, TokenManager tokenManager) {
        this.nextHandler = nextHandler;
        this.tokenManager = tokenManager;
    }

    public void handle(Request request) {
        String email = this.tokenManager.getEmailFromToken(request.getToken());
        if (!isValidEmail(email))
            throw new RuntimeException("Authentication failed.");
        System.out.println("Authentication passed.");
        this.nextHandler.handle(request);
    }

    private boolean isValidEmail(String email) {
        return true;
    }
}
