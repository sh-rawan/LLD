package ChainOfResponsibility.handlers;

import ChainOfResponsibility.managers.TokenManager;
import ChainOfResponsibility.managers.UserManager;

public class RequestHAndlerFactory {
    private RequestHAndlerFactory() {
    }

    public static RequestHandler getHandler(String apiName) {
        return new ValidationHandler(new AuthenticationHandler(
                new AuthorizationHandler(new IdleHandler(), new UserManager()), new TokenManager()));
    }
}
