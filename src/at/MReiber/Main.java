package at.MReiber;

public class Main {

    public static void main(String[] args) {
        Factorization fact = new Factorization();
        long number = Long.MAX_VALUE;
        System.out.println("The number " + number + " is " + fact.toBitLength(number) + " bit long");
        System.out.println("Its prime factors are: ");
        fact.factorization(number);

    }
}