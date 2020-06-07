//Дано целое число от 1 – 100. Необходимо найти максимальный делить числа 
//(кроме 1 и самого числа), деление на которое не дает остаток (т.е. деление без остатка);
package HomeWork2;

public class NewClass3 {

    public static void one(int a) {
        int max = 1;

        for (int j = 2; j <= a; j++) {
            if (a != j && a % j == 0) {
                if (j > max) {
                    max = j;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        one(88);
    }
}
