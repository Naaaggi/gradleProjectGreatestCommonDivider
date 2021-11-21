package MyApp.commands.impl;

import MyApp.commands.ICommand;

public class ExitCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("Exit program.");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Exit program";
    }


}

