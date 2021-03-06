/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyApp;


import java.util.LinkedList;

import MyApp.commands.CommandFactory;
import MyApp.commands.ICommand;
import MyApp.console.IConsole;
import MyApp.console.impl.Console;

public class App {

    public static void main(String[] args) {
        IConsole console = new Console();
        CommandFactory factory = new CommandFactory(console);
        LinkedList<ICommand> cmds = factory.returnsCommands();
        cli(cmds, console);
    }

    private static void cli(LinkedList<ICommand> cmds, IConsole console) {
        do {
            printCommandLineMenu(cmds);
            ICommand cmd = selectAnOption(cmds, console);
            cmd.execute();
        } while(true);
    }

    private static void printCommandLineMenu(LinkedList<ICommand> cmds) {
        System.out.println("Console-Application: Exercise-1               <Mohamed Neji> <Ghazouani> <579181>\n");
        for (int i = 1; i < cmds.size(); i++) {
            System.out.println(i + ". " + cmds.get(i));
        }
        System.out.println("0. " + cmds.get(0));
    }

    private static ICommand selectAnOption(LinkedList<ICommand> cmds, IConsole console) {
        do {
            int selectedOption = console.readInteger("Please enter an option: ");
            if (isValidOption(selectedOption, 0, cmds.size())) {
                return cmds.get(selectedOption);
            }
        } while (true);
    }

    private static boolean isValidOption(int index, int min, int max) {
        return index >= min && index < max;
    }
}
