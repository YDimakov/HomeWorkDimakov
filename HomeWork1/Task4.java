
/**
 * Задание № 4
 *
 * 1) В переменной min лежит число от 0 до 59. Определите в какую четверть часа
 * попадает это число (в первую, вторую, третью или четвертую).
 *
 * - от 0 до 14 - первая - от 15 до 29 - вторая - от 30 до 44 - третья - от 45
 * до 59 - четвертая - если число не входит в диапазон, то вывести сообщение об
 * этом
 *
 * Пример пример сообщения: System.out.println("первая")
 *
 * Пример вызова функции в main: checkTimePath(15) checkTimePath(100)
 *
 * 2) В функцию приходит время в виде миллисекунд. Необходимо вывести в
 * консолько сколько в этих миллисекундах часов, минут и секунд. 1секунда = 1000
 * милиссекунд.
 *
 * Пример вывода: int hours = ... System.out.println("Часы: " + hours)
 */
public class Task4 {

    public static void checkTimePath(int number) {
        /**
         * NOTE! Первое условие я бы убрал и просто написал бы обычный else в
         * конце. Это более правильно.
         */
        if (number >= 0 && number <= 14) {
            System.out.println("Ваше значение " + number + " мин., вы попали в первый диапазон от 0 до 14 минут.");
        } else if (number >= 15 && number <= 29) {
            System.out.println("Ваше значение " + number + " мин., вы попали во второй диапазон от 15 до 29 минут.");
        } else if (number >= 30 && number <= 44) {
            System.out.println("Ваше значение " + number + " мин., вы попали в третий диапазон от 30 до 44 минут.");
        } else if (number >= 45 && number <= 59) {
            System.out.println("Ваше значение " + number + " мин., вы попали в четвётрый диапазон от 45 до 59 минут.");
        } else {
            System.out.println("Вы ввели неверные данные");
        }
    }

    public static void parseMilliseconds(long milliseconds) {
        /**
         * NOTE! Чего пропустил? Не понятно как делать или просто забыл?
         * -Забыл))))
         */
        long chas = milliseconds / 3600000;
        if (milliseconds == 0) {
            System.out.println("На 0 делить нельзя!");
        } else {
            System.out.println("Часы: " + chas);
        }
        
        long minuta = milliseconds / 60000;
        if (milliseconds == 0) {
            System.out.println("На 0 делить нельзя!");
        } else {
            System.out.println("Минуты: " + minuta);
        }
        
        long secunda = milliseconds / 1000;
        if (milliseconds == 0) {
            System.out.println("На 0 делить нельзя!");
        } else {
            System.out.println("Секунд: " + secunda);
        }
    }

    public static void main(String[] args) {
        // вызвать функцию здесь с разными сходными параметрами
        checkTimePath(10);
        checkTimePath(20);
        checkTimePath(32);
        checkTimePath(58);
        checkTimePath(68);
        parseMilliseconds(443426457);
    }

}
