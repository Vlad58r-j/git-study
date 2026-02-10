import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Размер массива -> ");
        var arrayLength = new Scanner(System.in).nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = new Random().nextInt(101);
        }
        System.out.println(Arrays.toString(array));

        var result = 1;
        for (int i = 0; i < 3; i++) {
            var max = 0;
            var position = 0;

            for (int j = 0; j < arrayLength; j++) {
                if (array[j] > max) {
                    max = array[j];
                    position = j;
                }
            }
            result *= max;
            array[position] = 0;
        }

        System.out.println(result);
    }
}
