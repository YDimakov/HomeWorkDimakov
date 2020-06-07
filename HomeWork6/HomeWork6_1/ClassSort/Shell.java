package HomeWork6_1.ClassSort;

import HomeWork6_1.InterfaceSort.Sortable;

public class Shell implements Sortable {

    boolean bool;

    @Override
    public void numbersSort(int[] userNumbers, boolean variable) {
        bool = variable;
        int num = userNumbers.length;

        sortNumberOne(userNumbers, 0, num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print(userNumbers[i] + " ");
        }
    }

    /**
     * NOTE! Не мог бы ты объяснить почему сделал этот метод публичным?
     * 
     * -исправил!
     */
    private void sortNumberOne(int[] userNumbers, int low, int high) {
        for (int h = low; h <= high; h++) {
            swapOne(userNumbers, h, getShellOne(userNumbers, h, high));
        }
    }

    /**
     * NOTE! Не мог бы ты объяснить почему сделал этот метод публичным?
     * 
     * -исправил!
     */
    private int getShellOne(int[] userNumbers, int low, int high) {
        int shell = low;
        if (!bool) {
            for (int i = low + 1; i <= high; i++) {
                if (userNumbers[i] > userNumbers[shell]) {
                    shell = i;
                }
            }
            return shell;
        } else {
            for (int i = low + 1; i <= high; i++) {
                if (userNumbers[i] < userNumbers[shell]) {
                    shell = i;
                }
            }
            return shell;
        }
    }

    /**
     * NOTE! Не мог бы ты объяснить почему сделал этот метод публичным?
     * 
     * -исправил!
     */
    private void swapOne(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
