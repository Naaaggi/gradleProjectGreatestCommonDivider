package MyApp.commands.impl;

import MyApp.commands.algorithms.StringMatchingAlgorithm;
import MyApp.commands.ICommand;
import MyApp.console.IConsole;

public class StringMatchingAlgorithmCommand implements ICommand {

    final private IConsole console;

    public StringMatchingAlgorithmCommand(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        String text = "I’m an egotistical bastard, and I name all my projects after myself. First ‘Linux’, now ‘Git’";
        String search = console.readString(" Linus Torvald's joke: I’m an egotistical bastard, " +
                "and I name all my projects after myself. First ‘Linux’, now ‘Git’\n" +
                "Please, enter a word for search:");

        String match = StringMatchingAlgorithm.match(text, search);
        console.write("The word is "+ match);
    }

    @Override
    public String toString() {

        return "Search for a specific string in Linus Torvald's joke (String-MatchingAlgorithm).";

    }
}
