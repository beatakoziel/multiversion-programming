
public class FibonacciSequenceService {

    public void printFibonacciSequence1(int n) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            ++counter;
        }
        System.out.println("\n");
    }

    public void printFibonacciSequence2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fib2(i) + " ");
        }
        System.out.println("\n");
    }

    private int fib2(int n) {
        if (n == 1) {return 0;}
        if (n == 2) {return 1;}
        int prevPrev = 0;
        int prev = 1;
        int currentNumber = 0;
        for (int i = 2; i < n; i++) {
            currentNumber = prevPrev + prev;
            prevPrev = prev;
            prev = currentNumber;
        }
        return currentNumber;
    }

    public void printFibonacciSequence3(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(fib3(i) + " ");
        System.out.println("\n");
    }

    private int fib3(int n) {
        int[] fibSeq = new int[n + 2];
        int i;
        fibSeq[0] = 0;
        fibSeq[1] = 1;

        for (i = 2; i <= n; i++) {
            fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
        }
        return fibSeq[n];
    }

}
