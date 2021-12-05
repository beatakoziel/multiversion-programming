public class Main {
    public static void main(String args[]) {
        FibonacciSequenceService fibonacciSequenceService = new FibonacciSequenceService();
        //realized on int values, iterative
        fibonacciSequenceService.printFibonacciSequence1(10);
        fibonacciSequenceService.printFibonacciSequence2(10);
        fibonacciSequenceService.printFibonacciSequence3(10);
        //realized on int values, iterative
        FactorialService factorialService = new FactorialService();
        factorialService.getFactorial1(5);
        factorialService.getFactorial2(5);
        factorialService.getFactorial3(5);
    }
}
