import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        var value = new Scanner(System.in).nextLong();
        var oldValue = value;

        List<Long> listSimbol = new ArrayList<>();
        while (value >= 1) {
            listSimbol.addLast(value % 10);
            value = value / 10;
        }

        var sizeList = listSimbol.size() - 1;
        value = 0;
        var counter = 0;
        for (long i = (long) pow(10, sizeList); i > 0; i /= 10L) {
            value += listSimbol.get(counter) * i;
            counter++;
        }

        if (oldValue - value == 0)
            System.out.println("Число " + oldValue + " является палиндромом");
        else
            System.out.println("Число " + oldValue + " не является палиндромом");
    }
}
