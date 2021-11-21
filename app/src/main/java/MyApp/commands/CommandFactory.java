package MyApp.commands;

import java.util.LinkedList;

import MyApp.commands.impl.*;
import MyApp.console.IConsole;

public class CommandFactory {

    final private IConsole console;

    public CommandFactory(IConsole console) {
        super();
        this.console = console;
    }

    public LinkedList<ICommand> returnsCommands() {
        LinkedList<ICommand> cmds = new LinkedList<ICommand>();
        cmds.add(new ExitCommand());
        cmds.add(new GCDEuclidSubstractionRecursivCommand(console));
        cmds.add(new GCDEuclidSubstractionIterativeCommand(console));
        cmds.add(new GCDEuclidDivisionRestRecursivCommand(console));
        cmds.add(new GCDEuclidDivisionRestIterativeCommand(console));
        cmds.add(new SieveOfEratosthenesCommand(console));
        cmds.add(new StringMatchingAlgorithmCommand(console));

        return cmds;
    }


}
