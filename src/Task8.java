import java.math.BigInteger;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        var value = new Scanner(System.in).nextBigInteger();

        for (int i = 2; i < 150; i++) {
            value = value.divide(BigInteger.valueOf(i));
            if (value.equals(BigInteger.ONE)) {
                value = BigInteger.valueOf(i);
                break;
            }
        }

        System.out.println(value);
    }
}
