import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Факториал -> ");
        var valueFactorial = new Scanner(System.in).nextLong();
        var result = factorial(valueFactorial);
        var counter = 0;
        while (result % 10 == 0) {
            result /= 10;
            counter++;
        }
        System.out.println("Количество нулей на конце -> " + counter);
    }

    public static long factorial(long value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
}
