import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Факториал -> ");
        var valueFactorial = new Scanner(System.in).nextLong();
        var result = 0;

        for (int i = 1; valueFactorial >= (int) Math.pow(5, i); i++) {
            result += (int) (valueFactorial / (int) Math.pow(5, i));
        }

        System.out.println("Количество нулей на конце -> " + result);
    }
}