
/**
 * Задание № 2
 *
 * 1) Написать алгоритм проверки числа на четность. в методе main вывести
 * сообщение: - System.out.println("Четное"), если введенное число было четным,
 * то есть функция вернула true - System.out.println("Нечетное"), если введенное
 * число было нечетным, то есть функция вернула false
 *
 * 2) Написать фукнцию расчета среднего числа между 4-мя значениями. Результат
 * вывести в консоль в main
 *
 * 3) переделайте код метода clearOperator1() так, чтобы использовались операции
 * +=, -=, *=, /=. Количество строк кода при этом не должно измениться.
 *
 * 4) Переделайте этот код метода clearOperator2(), чтобы в нем использовались
 * операции ++ и --. Количество строк кода при этом не должно измениться.
 *
 * 5) Вычислить выражения (записать в пригодной для java форме): знак "/" -
 * дробь. Вычисления можно сделать либо отдельной функцией, либо в методе main.
 *
 * a) (1/4 + 5/8 - 1) * 9 - 3 b) 9 + 3.6 + (33/(48*5/3)) c) 10 * 1/2 + (48*5/3)
 *
 */
public class Task2 {

    public static double sredneeArif(double a, double b, double c, double d) {
        /**
         * NOTE! По сути, тут можно обойтись одной строчкой. Просто все делать
         * сразу с return.
         *
         * return (a + b + c + d) / 4;
         */
        return (a + b + c + d) / 4;
    }

    public static boolean isEvenNumber(int number) {
        /**
         * NOTE! По сути, тут можно обойтись одной строчкой. Просто все делать
         * сразу с return.
         *
         * return a % 2 == 0;
         *
         * А уже в методе main написать if-else. if (isEvenNumber(...)) {
         * System.out.println("Четное число"); } else {
         * System.out.println("Нечетное число"); }
         */
        return number % 2 == 0;
    }

    public static void clearOperator1() {
        int num = 47;
        num += num;
        num -= 1;   // если бы тут стояло num была бы арифметическая ошибка НА 46 строчке.( 0/0 не делится)
        num *= num;
        num /= num;

        System.out.println("clearOperator1 = " + num);
    }

    public static void clearOperator2() {
        /**
         * NOTE! Тут неправильно. ++ и -- автоматически сохраняют значения в
         * твою переменню. Так что присваивание не нужно.
         */
        int num = 47;
        num++;
        num--;
        num++;
        num--;
        System.out.println("clearOperator1 = " + num);
    }

    public static void clearOperatorA() {
        /**
         * NOTE! Нет нуждый выделять объявление переменной в отдельную строку.
         *
         * int a = (1 / 4 + 5 / 8 - 1) * 9 - 3;
         */
        int a = (1 / 4 + 5 / 8 - 1) * 9 - 3;
        System.out.println();
        System.out.println("Решите вражение (1 / 4 + 5 / 8 - 1) * 9 - 3");
        System.out.println("Ответ: " + a + ".");

    }

    public static void clearOperatorB() {
        /**
         * NOTE! Нет нужды выделять объявление переменной в отдельную строку.
         */
        double b = 9 + 3.6 + (33 / (48 * (5 / 3)));
        System.out.println();
        System.out.println("Решите вражение 9 + 3.6 + (33 / (48 * (5 / 3)))");
        System.out.println("Ответ: " + b + ".");
    }

    public static void clearOperatorC() {
        /**
         * NOTE! Нет нужды выделять объявление переменной в отдельную строку.
         * Тут еще есть ошибка в арифметических операциях. У тебя 10 умножаетс
         * на 1, а потом делится на 2. А в условии 1/2 (одна вторая).
         */
        int c = 10 * (1 / 2) + (48 * (5 / 3));
        System.out.println();
        System.out.println("Решите вражение 10 * (1 / 2) + (48 * (5 / 3))");
        System.out.println("Ответ: " + c + ".");
        System.out.println();
    }

    public static void main(String[] args) {
        clearOperator1();

        clearOperator2();

        if (isEvenNumber(16)) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

        clearOperatorA();

        clearOperatorB();

        clearOperatorC();

        System.out.println("Cреднее арифметическое значение = " + sredneeArif(7.5, 6.2, 7.1, 7.6));
    }
}
