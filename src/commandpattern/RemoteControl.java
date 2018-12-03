package commandpattern;

import java.util.function.Consumer;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command[] undoCommands;
    int nextUndo = 0;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoCommands = new Command[7];
        Command com = new NoCommand();
      //  undoCommand = com;
        for (int i = 0; i < 7; i++) {
            onCommands[i] = com;
            offCommands[i] = com;
            undoCommands[i] = com;
        }

    }

    public void setCommand(int slot, Command onCommand, Command offComand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offComand;
    }

    public void onPressed(int slot) {
        onCommands[slot].execute();
        undoCommands[nextUndo++] = offCommands[slot];

    }

    public void offPressed(int slot) {
        offCommands[slot].execute();
        undoCommands[nextUndo++] = onCommands[slot];
    }

    public void undoPressed() {
        
        if (nextUndo >= 0) {
            undoCommands[--nextUndo].execute();
            
        }
    }
}
