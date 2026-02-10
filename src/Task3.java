import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        var value = new Scanner(System.in).nextInt();
        System.out.println();
        value = (int) pow(10, (int) log10(value) + 1) + value;
        System.out.println(value);
        value = value * 10 + 1;
        System.out.println(value);

        var valueBoolean = false;
        for (int i = 3; i < value / 2; i += 2) {
            if (value % i == 0) {
                valueBoolean = true;
                break;
            }
        }

        if (valueBoolean)
            System.out.println("Число не простое");
        else
            System.out.println("Число просто");
    }
}
