/**
 * Задание № 5
 *
 * 1) Написать алгоритм округления числа до целого. Например 2.5 -> 3, 2.6 -> 3,
 * 2.4 -> 2
 *
 * Вызвать функцию в методе main, а результат вывести в консоль Пример вызова:
 * int result = roundNumber(4.45) System.out.println(result)
 *
 * 2) Написать алгоритм получения дробной части числа. То есть, если у меня
 * число 2.75, то я хочу получить 0.75
 *
 */
public class Task5 {

    public static double roundNumber(double number) {
        // TODO написать проверку здесь и вывести сообщение
        System.out.println("До округления - " + number);
        double ad = (Math.round(number));
        return ad;
    }

    public static double getTail(double number) {
        // TODO получение дробной части
        System.out.println("До получения дробной части - " + number);
        double aa = number % 1;
        return aa;
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        System.out.println("После округления - " + roundNumber(4.45));
        System.out.println();
        System.out.println("После получения дробной части - " + String.format("%.2f", getTail(3.24)));
    }
}
