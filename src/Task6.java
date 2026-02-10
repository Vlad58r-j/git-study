import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        var bigInteger1 = new Scanner(System.in).nextBigInteger();
        var bigInteger2 = new Scanner(System.in).nextBigInteger();

        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}
