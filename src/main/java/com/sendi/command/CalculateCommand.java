package com.sendi.command;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "calculate", description = "Does simple calculation on two operands.",
        mixinStandardHelpOptions = true)
final public class CalculateCommand implements Runnable {

    @Option(names = {"-c", "--calculate"}, description = "Calculation")
    String calculate = "";

    @Override
    public void run() {
        if (calculate.isBlank() || calculate.isEmpty()) throw new RuntimeException("Invalid input!");

        if (calculate.contains("/")) {
            int firstNum = Integer.parseInt(calculate.substring(0, calculate.indexOf("/")));
            int secondNum = Integer.parseInt(calculate.substring(calculate.indexOf("/") + 1));
            System.out.println("The result is " + firstNum / secondNum);
        } else if (calculate.contains("*")) {
            int firstNum = Integer.parseInt(calculate.substring(0, calculate.indexOf("*")));
            int secondNum = Integer.parseInt(calculate.substring(calculate.indexOf("*") + 1));
            System.out.println("The result is " + firstNum * secondNum);
        } else if (calculate.contains("-")) {
            int firstNum = Integer.parseInt(calculate.substring(0, calculate.indexOf("-")));
            int secondNum = Integer.parseInt(calculate.substring(calculate.indexOf("-") + 1));
            System.out.println("The result is " + (firstNum - secondNum));
        } else if (calculate.contains("+")) {
            int firstNum = Integer.parseInt(calculate.substring(0, calculate.indexOf("+")));
            int secondNum = Integer.parseInt(calculate.substring(calculate.indexOf("+") + 1));
            System.out.println("The result is " + (firstNum + secondNum));
        }
    }
}
