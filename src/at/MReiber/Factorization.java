package at.MReiber;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;

public class Factorization {

    public int toBitLength(long n) {
        return (int) (Math.log(n) / Math.log(2) + 1);
    }

    private Boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void factorization(long n) {
        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            long start = System.nanoTime();
            for (int i = 2; i < n; i++) {
                while (n % i == 0) {
                    System.out.println(i + " ");
                    n = n / i;
                }
            }
            if (n > 2) {
                long end = System.nanoTime();
                System.out.println(n);
                System.out.println("Time: " + ((end - start) / 1000000) + " ms");
            }
        }
    }
}
