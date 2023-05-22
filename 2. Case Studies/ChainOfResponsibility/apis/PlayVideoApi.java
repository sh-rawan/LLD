package ChainOfResponsibility.apis;

import ChainOfResponsibility.data.Request;
import ChainOfResponsibility.data.Response;
import ChainOfResponsibility.handlers.RequestHAndlerFactory;

public class PlayVideoApi {
    public Response playVideo(Request request) {
        RequestHAndlerFactory.getHandler("playVideo").handle(request);
        return null;
    }

}
