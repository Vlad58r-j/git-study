import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Количество тактов: ");
        var tact = new Scanner(System.in).nextInt();

        System.out.print("Количество красных бактерий: ");
        var red = new Scanner(System.in).nextInt();

        System.out.print("Количество зеленых бактерий: ");
        var green = new Scanner(System.in).nextInt();

        var result = counter(tact, red, green);
        System.out.println("Количество красных, после всех тактов: " + result.get("red") +
                           "\nКоличество зеленых, после всех тактов: " + result.get("green"));
    }

    public static Map<String, Long> counter(long tact, long red, long green) {
        for (int i = 0; i < tact; i++) {
            red += green;
            green = red - green;
        }
        return Map.of("red", red, "green", green);
    }
}
