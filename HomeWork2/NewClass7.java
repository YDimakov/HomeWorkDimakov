//Есть массив из десяти целых чисел. Заменить каждый элемент с нечетным индексом на 0;
package HomeWork2;

public class NewClass7 {

    public static void main(String args[]) {
        int array[] = new int[]{8, 211, 310, 22, 122, 320, 42, 155, 100, 41};
        int vc = array.length;
        for (int i = 0; i < vc; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + "  ");
        }
    }
}
