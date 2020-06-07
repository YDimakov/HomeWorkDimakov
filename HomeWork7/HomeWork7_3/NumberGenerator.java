package HomeWork7_3;

import java.util.ArrayList;
import java.util.Random;

public class NumberGenerator { // генератор чисел

    public static ArrayList generateNumbers(int number) {
        final int MAX = 49;
        final int MIN = 1;

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(number);
        int it;
        for (int i = 0; i < number; i++) {
            do {
                it = MIN + random.nextInt(MAX);
            } while (check(numbers, it));
            numbers.add(it);
        }
        return numbers;
    }

    private static boolean check(ArrayList<Integer> array2, int value2) {
        for (int i : array2) {
            if (value2 == i) {
                return true;
            }
        }
        return false;
    }
}
