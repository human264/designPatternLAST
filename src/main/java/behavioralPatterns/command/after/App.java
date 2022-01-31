package behavioralPatterns.command.after;

import behavioralPatterns.command._01_before.Game;
import behavioralPatterns.command._01_before.Light;

public class App {



    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.undo();


        button.press(new LightOnCommand(new Light()));

        button.undo();
    }

}
