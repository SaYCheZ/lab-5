import java.math.BigInteger;

public class MersennePrimes {

    public static void main(String[] args) {
        System.out.println("Простые числа Мерсенна для p ≤ 100:");
        System.out.println("p\t2^p - 1");

        for (int p = 2; p <= 100; p++) {
            if (isPrime(p)) {
                BigInteger mersenne = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
                if (mersenne.isProbablePrime(100)) {
                    System.out.println(p + "\t" + mersenne);
                }
            }
        }
    }

    // Проверка, является ли число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}