package at.ac.fh_kufstein;

/**
 * Created by marti on 21.06.2017.
 */
public class fibonacci {

    public static void main(String[]args) {
        for (int i = 1; i <= 3; i++) {
            long j = fibonacci.fib(i);
            System.out.println(j);
        }
    }

    public static long fib(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2); //der rekursive Aufruf
        }
    }

}
