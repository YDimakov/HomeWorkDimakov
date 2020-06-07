//Есть массив из десяти целых чисел. Необходимо посчитать среднее арифметическое для всех элементов массива;
package HomeWork2;

public class NewClass9 {

    public static void main(String args[]) {
        int array[] = new int[]{8, 211, 310, 22, 122, 320, 42, 155, 100, 41};
        int vc = 0;
        int ar;
        for (int i = 0; i < array.length; i++) {
            vc += array[i];
        }
        ar = vc / array.length;
        System.out.println("Среднее арифметическое значение массива = " + ar);
    }
}
