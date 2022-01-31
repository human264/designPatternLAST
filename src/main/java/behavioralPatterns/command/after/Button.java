package behavioralPatterns.command.after;

import behavioralPatterns.command._01_before.Game;
import behavioralPatterns.command._01_before.Light;

import java.util.Stack;


//invoke
public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if(!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }




}
