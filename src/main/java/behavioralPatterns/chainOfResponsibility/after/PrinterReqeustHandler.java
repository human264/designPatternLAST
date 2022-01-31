package behavioralPatterns.chainOfResponsibility.after;

import behavioralPatterns.chainOfResponsibility._01_before.Request;

public class PrinterReqeustHandler extends RequestHandler {

    public PrinterReqeustHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
