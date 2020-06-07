package HomeWork3;

import java.util.Scanner;

public class Сonsole {

    /**
     * NOTE!
     *
     * - Переменные chislo1 и chislo2, а также методы для арифметических
     * операций можно вынести в отдельный класс. Тогда по сути у тебя будет
     * класс, который будет работать с консолью и класс-калькулятор. А тут
     * просто как поле класса у тебя будет объект калькулятора
     *
     * - Неизменные значения (надписи в меню, числа для выбора пункта меню и
     * т.д.), которые определены заранее можно вынести в стические константы, а
     * в коде ты их просто будешь использовать. Это даст тебе более чистый и
     * понятный код.
     *
     * - Когда у тебя цельная строка, которая просто имеет перевод на новую
     * строку (\n), тогда нет необходимости конкатенировать все части строки. Их
     * можно записать как одну цельную строку:
     *
     * "1: Сложение\n2: Разность\n3: Умножение\n4: Деление\n0: Выход"
     *
     *
     * -Когда у тебя простая операция, которая не требует дополнительной логики,
     * то ты ее можешь сразу возвращать в ретурне, например: public static
     * double slojenie(double a, double b) { return a + b; }
     *
     * - Я понимаю, что уровень английского у всех разный, но старайся
     * использовать английские слова при именовании переменных, методов класса и
     * т.д. Еси не знаешь каких-то слов, то всегда есть переводчики. Пусть лучше
     * это будет написано неправильно на английском, чем транслитом.
     */
    public static boolean cycle_one = true;
    public static boolean cycle_two = true;
    public static boolean cycle_three = true;

    public static void WorkСonsole() {
        Scanner scanner = new Scanner(System.in);
        ActionСalculator calculator = new ActionСalculator();

        while (cycle_one) {
            System.out.println("«Выберите функцию»");
            System.out.println(" 1: Сложение\n 2: Разность\n 3: Умножение\n 4: Деление\n 0: Выход");
            int number = scanner.nextByte();
            while (cycle_two) {
                if (number > 0 && number <= 4) {
                    System.out.println("«Введите первое число»");
                    int value1 = scanner.nextByte();
                    System.out.println("«Введите второе число»");
                    int value2 = scanner.nextByte();

                    switch (number) {
                        case 1:
                            calculator.addition(value1, value2);
                            System.out.println("Ваш результат = " + calculator.addition(value1, value2));
                            break;
                        case 2:
                            calculator.difference(value1, value2);
                            System.out.println("Ваш результат = " + calculator.difference(value1, value2));
                            break;
                        case 3:
                            calculator.multiplication(value1, value2);
                            System.out.println("Ваш результат = " + calculator.multiplication(value1, value2));
                            break;
                        case 4:
                            if (value1 == 0 || value2 == 0) {
                                System.out.println("На 0 делить нельзя!!!");
                                System.out.println(" 1: Ввести другие числа\n 0: Выйти в меню  ");
                                int value4 = scanner.nextByte();
                                if (value4 == 1) {
                                    continue;
                                } else if (value4 == 0) {
                                    cycle_three = false;
                                    break;
                                }
                            } else {
                                calculator.division(value1, value2);
                                System.out.println("Ваш результат = " + calculator.division(value1, value2));
                            }
                            break;
                    }

                    while (cycle_three) {
                        System.out.println(" 1:Меню\n 0:Выход");
                        int value3 = scanner.nextByte();
                        if (value3 == 0 || value3 == 1) {
                            if (value3 == 0) {
                                System.out.println("До новых встреч!");
                                cycle_one = false;
                                cycle_two = false;
                                break;
                            } else if (value3 == 1) {
                                cycle_three = false;
                                break;
                            }
                        } else {
                            System.out.println("Неверное число!");
                        }
                        break;
                    }
                } else if (number == 0) {
                    System.out.println("До новых встреч!");
                    cycle_one = false;
                    cycle_two = false;
                    break;

                } else {
                    System.out.println("Неверное число!");
                }
                break;
            }
        }
        scanner.close();
    }
}
