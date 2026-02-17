import java.util.Scanner;

import static java.lang.Math.*;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Количество мест -> ");
        var valuePlace = new Scanner(System.in).nextLong();

        var fastResult = getFastResult(valuePlace);
        System.out.println("n! / E -> " + fastResult);

        var result = getResultWithFor(valuePlace);
        System.out.println("n! * SUM{(-1)^k / k!} -> " + (long) result);

        var subfactorialResult = subfactorial(valuePlace);
        System.out.println("(n-1)(!(n-1) + !(n-2)) -> " + subfactorialResult);
    }

    private static long subfactorial(long value) {
        if (value == 0) {
            return 1L;
        } else if (value == 1L) {
            return 0;
        } else {
            return (value - 1) * (subfactorial(value - 1) + subfactorial(value - 2));
        }
    }

    private static long getFastResult(long valuePlace) {
        return (long) (factorial(valuePlace) / E);
    }

    private static double getResultWithFor(long valuePlace) {
        long resultFactorial = 1;
        double result = 0;

        for (long i = 2; i <= valuePlace; i++) {
            resultFactorial *= i;
            result += (Math.pow(-1, i) / resultFactorial);
        }

        return result * factorial(valuePlace);
    }

    private static long factorial(long value) {
        if (value == 1L) {
            return 1L;
        } else {
            return value * factorial(value - 1);
        }
    }
}
