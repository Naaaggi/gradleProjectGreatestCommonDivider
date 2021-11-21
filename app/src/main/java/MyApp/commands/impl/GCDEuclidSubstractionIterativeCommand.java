package MyApp.commands.impl;

import MyApp.commands.ICommand;
import MyApp.commands.algorithms.GCDEuclidDivisionRestIt;
import MyApp.commands.algorithms.GCDEuclidSubtractionIt;
import MyApp.console.IConsole;

public class GCDEuclidSubstractionIterativeCommand implements ICommand {


    final private IConsole console;

    public GCDEuclidSubstractionIterativeCommand(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        int x = console.readInteger("Please, enter a number for x:");
        int y = console.readInteger("Please, enter a number for y:");

        int result = GCDEuclidSubtractionIt.getGCD(x,y);

        console.write("gcd(" + x + ", " + y + ") = " + result );
    }
    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.";
    }

}
