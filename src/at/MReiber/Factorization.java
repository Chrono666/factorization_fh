package at.MReiber;

public class Factorization {

    public int toBitLength(long n) {
        return (int) (Math.log(n) / Math.log(2) + 1);
    }

/*
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
*/

    public void factorization(long n) {
            long start = System.nanoTime();
            for (int i = 2; i < n; i++) {
                while (n % i == 0) {
                    System.out.println(i + " ");
                    n = n / i;
                }
            }
            if (n > 2) {
                System.out.println(n);
                long end = System.nanoTime();
                System.out.println("Time: " + ((end - start) / 1000000) + " ms");
            }
        }
}
