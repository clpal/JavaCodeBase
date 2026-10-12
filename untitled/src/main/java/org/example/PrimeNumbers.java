package org.example;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }

        }

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i== 0) {
                return false;
            }
        }

        return true;
    }
}
