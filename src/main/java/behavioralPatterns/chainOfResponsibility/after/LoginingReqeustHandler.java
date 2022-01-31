package behavioralPatterns.chainOfResponsibility.after;

import behavioralPatterns.chainOfResponsibility._01_before.Request;

public class LoginingReqeustHandler extends RequestHandler {
    public LoginingReqeustHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }


    @Override
    public void handle(Request request) {
        System.out.println("로깅????");
        super.handle(request);
    }
}
