import java.math.BigInteger;

public class FindNumbersDiv5or6 {

    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE);
        int count = 0;

        System.out.println("Первые 10 чисел, больших Long.MAX_VALUE, кратных 5 или 6:");

        while (count < 10) {
            start = start.add(BigInteger.ONE);
            if (start.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                    start.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                System.out.println(start);
                count++;
            }
        }
    }
}