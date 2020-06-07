//Посчитать сумму всех чисел от 0 до N. Реализовать задание через while;
package HomeWork2;

public class NewClass1 {

    public static void summa(int n) {
        int sum = 0;
        int i = 0;
        while (i < n) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        summa(32);
    }

}
