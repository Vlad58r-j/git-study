package task;

import java.util.Arrays;
import java.util.Random;

public class Test2{

    public static void main(String[] args) {
        int[] values = new int[new Random().nextInt(100)];

        for (int i = 0; i < values.length; i++) {
            values[i] = i == values.length - 1 ? new Random().nextInt(9) + 1
            : new Random().nextInt(10);
        }
        values[values.length - 1] = 9;

        System.out.println(Arrays.toString(values) + "  " + values.length);
        System.out.println();
        System.out.println(Arrays.toString(plusOne(values)) + "  " + values.length);
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}