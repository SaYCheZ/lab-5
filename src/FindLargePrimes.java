import java.math.BigInteger;

public class FindLargePrimes {

    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE);
        int count = 0;

        while (count < 5) {
            start = start.nextProbablePrime();
            System.out.println("Найдено простое число: " + start);
            count++;
        }
    }
}