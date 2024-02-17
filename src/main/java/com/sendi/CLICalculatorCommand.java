package com.sendi;

import com.sendi.command.CalculateCommand;
import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "CLI-Calculator", description = "...",
        mixinStandardHelpOptions = true, subcommands = {CalculateCommand.class})
public class CLICalculatorCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(CLICalculatorCommand.class, args);
    }

    public void run() {

        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
