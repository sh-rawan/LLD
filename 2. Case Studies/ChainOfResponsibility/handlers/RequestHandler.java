package ChainOfResponsibility.handlers;

import ChainOfResponsibility.data.Request;

public interface RequestHandler {
    void handle(Request request);
}
