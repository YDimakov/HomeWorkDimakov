//Есть двумерный массив (MxN) целых чисел (от 0 до 9). 
//С помощью команд System.out.println и System.out.print вывести в консоль весь массив как в примере ниже. 
//По возможности использовать чикл for-each;
package HomeWork2;

public class NewClass10 {

    public static void main(String args[]) {
        int[][] array2 = {
            {1, 2, 4, 5},
            {8, 9, 7, 0},
            {6, 6, 4, 3}};
//        for (int[] i : array2) {
//            System.out.println();                 // работает как и с for так и с for each
//            for (int a : i) {
//                System.out.print(a + " ");
//            }
        for (int i = 0; i < array2.length; i++) {
            System.out.println();
            for (int a = 0; a < array2[i].length; a++) {
                System.out.print(array2[i][a] + " ");
            }
        }
        System.out.println(" ");
    }
}
