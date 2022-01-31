package behavioralPatterns.mediator.after;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FrontDesk getFrontDesk() {
        return frontDesk;
    }

    public void setFrontDesk(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }
}
