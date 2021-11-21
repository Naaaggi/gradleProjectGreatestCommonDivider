package MyApp.commands.impl;

import MyApp.commands.algorithms.GCDEuclidDivisionRestIt;
import MyApp.commands.ICommand;
import MyApp.console.IConsole;

public class GCDEuclidDivisionRestIterativeCommand implements ICommand {

    final private IConsole console;

    public GCDEuclidDivisionRestIterativeCommand(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        int x = console.readInteger("Please, enter a number for x:");
        int y = console.readInteger("Please, enter a number for y:");

        int result = GCDEuclidDivisionRestIt.getGCD(x,y);

        console.write("gcd(" + x + ", " + y + ") = " + result );
    }
    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.";
    }

}
