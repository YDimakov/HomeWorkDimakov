//Посчитать степень числа. Использовать цикл for;
package HomeWork2;

public class NewClass2 {

    static int stepen(int r, int t) {
        int a = 1;
        for (int i = 1; i <= t; i++) {
            a *= r;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Ответ: " + stepen(14, 3));
    }
}
