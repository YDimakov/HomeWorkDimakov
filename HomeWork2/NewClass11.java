//Есть массив чисел с плавающей запятой. Необходимо реализовать сортировку пузырьком по возрастанию и по убыванию;
package HomeWork2;

public class NewClass11 {

    public static void main(String[] args) {
        double[] array = {3.14, 18.1, 4.15, 6.22, 5.83, 6.13};
        for (int i = 0; i < array.length; i++) {
            for (int g = i + 1; g < array.length; g++) {
                if (array[i] < array[g]) {    // знак сравнения "<" или ">" даёт понять,cортируем большее к меньшему или же меньшее к большему!!!! 
                    double temp = array[i];
                    array[i] = array[g];
                    array[g] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
