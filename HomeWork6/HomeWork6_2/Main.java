package HomeWork6_2;

import HomeWork6_2.Converter.Celsius;
import HomeWork6_2.Converter.Fahrenheit;
import java.util.Scanner;

public class Main {

    /**
     * NOTE! А это что такое? =) У меня проект почему-то не запускается. Не
     * подскажешь в чем причныа? =)
     *
     * -Я сам в шоке, у меня в 2 сохранённых файлах всё ок)
     */
    public static void main(String[] args) {
        String string1 = "Добро пожаловать в конвертер градусов Цельсия(°С)\nВведите любой градус ... ";
        String string2 = "Вы вышли за рамки допустимного значения.\nАбсолютный 0 считается -273.15";
        String string3 = "1: Конвертировать в Фаренгейты\n2: Конвертировать в Кельвины";
        Fahrenheit fahrenheit = new Fahrenheit();
        Celsius celsius = new Celsius();
        Scanner scanner = new Scanner(System.in);
        System.out.println(string1);
        double scan = scanner.nextDouble();
        if (scan < -273.15) {
            System.out.println(string2);
        } else {
            System.out.println(string3);
            int scan1 = scanner.nextInt();
            switch (scan1) {
                case 1:
                    fahrenheit.transfer(scan);
                    break;
                case 2:
                    celsius.transfer(scan);
                    break;
            }
        }
        scanner.close();
    }

}
