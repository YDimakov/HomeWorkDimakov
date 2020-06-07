//Есть массив чисел с плавающей запятой. Необходимо реализовать сортировку методом выбора по возрастанию и по убыванию;
package HomeWork2;

public class NewClass12 {

    public static void main(String[] args) {
        double[] array = {3.14, 18.1, 4.15, 6.22, 5.83, 6.13};
        for (int i = 0; i < array.length; i++) {
            double jc = array[i];
            int znach = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > jc) {   // знак сравнения "<" или ">" даёт понять,cортируем большее к меньшему или же меньшее к большему!!!! 
                    jc = array[j];
                    znach = j;
                }
            }
            double temp = array[i];
            array[i] = jc;
            array[znach] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
