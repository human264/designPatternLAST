package behavioralPatterns.chainOfResponsibility.after;

import behavioralPatterns.chainOfResponsibility._01_before.Request;

public class AuthReqeustHandler extends RequestHandler {
    public AuthReqeustHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }


    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
