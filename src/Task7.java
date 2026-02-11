import java.util.Scanner;

import static java.lang.Math.*;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Количество мест -> ");
        var valuePlace = new Scanner(System.in).nextInt();
        var result = round(factorial(valuePlace) / E);

        System.out.println(result);
    }


    private static long factorial(long value) {
        if (value == 1L) {
            return 1L;
        } else {
            return value * factorial(value - 1);
        }
    }
}
