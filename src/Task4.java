import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Размер массива -> ");
        var arrayLength = new Scanner(System.in).nextInt();
        var array = new ArrayList<Integer>();
        for (int i = 0; i < arrayLength; i++) {
            array.add(new Random().nextInt(201) - 100);
        }
        System.out.println(array);

        array.sort(new Task4Comparator());
        System.out.println(array);

        var minusMinusPlus = array.get(0) * array.get(1) * array.getLast();
        var plus = array.get(arrayLength - 2) * array.get(arrayLength - 3) * array.getLast();
        var result = Math.max(minusMinusPlus, plus);
        System.out.println(result);

//        var multi = 0;
//        for (int i = 0; i < arrayLength; i++) {
//            for (int j = 0; j < arrayLength; j++) {
//                for (int k = 0; k < arrayLength; k++) {
//                    if (k != i && i != j && k != j) {
//                        multi = array[i] * array[j] * array[k];
//                        result = Math.max(multi, result);
//                    }
//
//                }
//            }
//        }

    }

    static class Task4Comparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }
}
