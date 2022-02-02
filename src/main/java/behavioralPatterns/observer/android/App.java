package behavioralPatterns.observer.android;

import static behavioralPatterns.observer.android.Button.*;

public class App {

    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new ButtonClick());
        button.onClick();
    }
}


class ButtonClick implements OnClickListener {

    @Override
    public void onClick(Button button) {
        System.out.println(button.toString() + "is clicked");
    }
}
