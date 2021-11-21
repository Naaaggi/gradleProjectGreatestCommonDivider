package MyApp.commands.impl;

import MyApp.commands.ICommand;
import MyApp.commands.algorithms.SieveOfEratosthenes;
import MyApp.console.IConsole;

public class SieveOfEratosthenesCommand implements ICommand {

    final private IConsole console;

    public SieveOfEratosthenesCommand(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        int x = console.readInteger("Please, enter a number for x:");
        int[] primes = SieveOfEratosthenes.getPrime(x);
        for (int prime:
                primes) {
            console.write(Integer.toString(prime) + " is a prime number.");
        }
    }
    @Override
    public String toString() {

        return "Sieve of Eratosthenes.";

    }
}
