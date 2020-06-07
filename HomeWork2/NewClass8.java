//Получить первые N чисел из ряда Фибоначчи (использовать только циклы);
package HomeWork2;

public class NewClass8 {

    public static void UU(int k) {
        long a = 0;
        long b = 1;
        long tr;

        for (int i = 0; i < k; i++) {
            tr = a + b;
            System.out.print(tr+ "  ");
            a = b;
            b = tr;
        }
    }

    public static void main(String[] args) {
        UU(20);
    }
}
