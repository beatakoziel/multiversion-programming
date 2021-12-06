public class FactorialService {

    public void getFactorial1(int n) {
        System.out.printf("Factorial 1 for n=%s: ", n);
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact + "\n");
    }

    public void getFactorial2(int n) {
        System.out.printf("Factorial 2 for n=%s: ", n);
        int result = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        } else {
            System.out.println("n has to be positive");
        }
        System.out.println(result + "\n");
    }

    public void getFactorial3(int n) {
        System.out.printf("Factorial 3 for n=%s: ", n);
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        System.out.println(res + "\n");
    }

}
