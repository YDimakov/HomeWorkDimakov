//Есть массив из десяти целых чисел. Необходимо поменять элементы массива в обратном порядке;
package HomeWork2;

public class NewClass5 {

    public static void main(String args[]) {
        int rar;
        int array[] = new int[]{8, 211, 310, 22, 122, 320, 42, 155, 100, 41};
        int vc = array.length;
        for (int i = 0; i < vc; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < vc / 2; i++) {

            rar = array[vc - i - 1];
            array[vc - i - 1] = array[i];
            array[i] = rar;
        }
        for (int i = 0; i < vc; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
