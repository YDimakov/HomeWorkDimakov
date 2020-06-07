//Есть массив из десяти целых чисел. Необходимо вывести максимально и минимальное число из массива;
package HomeWork2;

public class NewClass4 {

    public static int Max(int[] array1) {
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        return max;
    }

    public static int Min(int[] array2) {
        int min = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {

        int array[] = new int[]{8, 211, 310, 22, 122, 320};
        int max = Max(array);
        System.out.println("Максимальное значение = " + max);
        int min = Min(array);
        System.out.println("Минимальное значение = " + min);
    }
}
