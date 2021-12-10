package exercises;

public class FibonacciTest {

    public static long fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static long mfib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long[] x = new long[n + 1];
            x[0] = 0;
            x[1] = 1;

            if (n != 2)
                x[n - 1] = memo(n - 1, x);

            return x[n - 1] + x[n - 2];
        }
    }

    private static long memo(int n, long[] x) {
        if (x[n] == 0) {
            x[n] = memo(n - 1, x) + x[n -2];
        }
        return x[n];
    }

    public static long ifib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fib_n   = 0;
            long fib_n_1 = 1;
            long fib_n_2 = 0;

            for (int i = 2; i <= n; i++) {
                fib_n   = fib_n_1 + fib_n_2;
                fib_n_2 = fib_n_1;
                fib_n_1 = fib_n;
            }
            return fib_n;
        }
    }

    public static void testRecursive(){
        int n = 9;

        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(fib(i) + "\t");
        }
        System.out.println();
    }

    public static void testMemoization(){
        int n = 9;
        System.out.println();
        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(mfib(i) + "\t");
        }
        System.out.println();
    }
    public static void testIterative(){
        int n = 9;
        System.out.println();
        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(ifib(i) + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        testRecursive();
        testMemoization();
        testIterative();
    }

}
