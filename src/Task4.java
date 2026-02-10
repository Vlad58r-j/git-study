import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Размер массива -> ");
        var arrayLength = new Scanner(System.in).nextInt();
        int[] array = new int[arrayLength];
        var counterNegative = 0;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = new Random().nextInt(201) - 100;
            counterNegative = array[i] < 0 ? counterNegative++ : counterNegative;
        }
        System.out.println(Arrays.toString(array));

        var result = 1;
        var multi = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                for (int k = 0; k < arrayLength; k++) {
                    if (k != i && i != j && k != j) {
                        multi = array[i] * array[j] * array[k];
                        result = Math.max(multi, result);
                    }

                }
            }
        }
//        for (int i = 0; i < 3; i++) {
//            var max = 0;
//            var position = 0;
//            var positionMin = 0;
//            var min = 0;
//
//            if (counterNegative > 1)
//                for (int j = 0; j < arrayLength; j++) {
//                    if (array[j] < min) {
//                        min = array[j];
//                        positionMin = j;
//                    }
//                }
//            array[positionMin] = 0;
//
//
//
//            position = 0;
//            for (int j = 0; j < arrayLength; j++) {
//                if (array[j] > max) {
//                    if (Math.abs(array[j]) > max) {
//
//                    }
//                    max = array[j];
//                    position = j;
//                }
//            }
//            result *= max;
//            array[position] = 0;
//        }

        System.out.println(result);
    }
}
