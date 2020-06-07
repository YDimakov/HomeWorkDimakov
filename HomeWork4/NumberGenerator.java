package HomeWork4;

import java.util.Random;

public class NumberGenerator { // генератор чисел

    /**
     * NOTE! Обычно константы пишут только прописными буквами. Типа MAX, MIN
     * исправил!
     */
    public static int[] generateNumbers(int number) {
        final int MAX = 49;
        final int MIN = 1;

        Random random = new Random();
        int[] numbers = new int[number];
        int it;
        for (int i = 0; i < number; i++) {
            do {
                it = MIN + random.nextInt(MAX);
            } while (check(numbers, it));
            numbers[i] = it;
        }
        return numbers;
    }

    /**
     * NOTE! Этот метод у тебя используется только внутри класса и нигде больше.
     * тогда здесь должен быть другой модификатор доступа. исправил!
     */
    private static boolean check(int[] array2, int value2) {
        for (int i : array2) {
            if (value2 == i) {
                return true;
            }
        }
        return false;
    }
}
