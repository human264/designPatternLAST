package behavioralPatterns.mediator.another;

public class ChatMediator extends Mediator {


    @Override
    void mediate(String data) {

        for (Colleague colleague : colleagues) {
            colleague.handle(data);
        }

    }
}
