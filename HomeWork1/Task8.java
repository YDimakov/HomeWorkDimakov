
/**
 * Задание № 7
 * <p>
 * 1) Даны 3 числа. Вычислить их сумму. Если все три числа равны, то нужно
 * вернуть сумму увеличеннную в два раза
 * <p>
 * 2) Даны 2 числа, нужно вернуть true, если одно из низ равно 10 или их сумма
 * равно 10
 * <p>
 * 3) Даны 3 числа, нужно вернуть максимально число Результат вывести в консоль
 * <p>
 * 4) Даны 3 числа, нужно вернуть минимальное число Результат вывести в консоль
 */
public class Task8 {

    public static int sum1(int a, int b, int c) {
        /**
         * NOTE! Если А == Б, и Б == С, то А будет равно С в любом случае. Как
         * ни крути, это даже проверять не надо
         */

        int result = a + b + c;
        if (a == b && b == c) {
            return result * 2;
        } else {
            return result;
        }

    }

    public static boolean sum2(int a, int b) {

        return (a == 10 || b == 10 || a + b == 10);

        // TODO решение для задания №2
    }

    public static void max(int a, int b, int c) {
        // TODO решение для задания №3
        if (a > b && a > c) {
            System.out.println("Максимальное значение a = " + a);
        }
        if (b > a && b > c) {
            System.out.println("Максимальное значение b = " + b);
        }
        if (c > a && c > b) {
            System.out.println("Максимальное значение c = " + c);
        }

    }

    public static void min(int a, int b, int c) {
        // TODO решение для задания №3
        if (a < b && a < c) {
            System.out.println("Минимальное значение а = " + a);
        }
        if (b < a && b < c) {
            System.out.println("Минимальное значение b = " + b);
        }
        if (c < a && c < b) {
            System.out.println("Минимальное значение c = " + c);
        }
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        System.out.println("Ответ = " + sum1(3, 3, 3));
        System.out.println("Boolean значение = " + sum2(5, 5));
        max(1, 2, 3);
        min(1, 2, 3);
    }
}
