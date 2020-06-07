package HomeWork6_3;

import HomeWork6_3.Displey.AdvertisingDisplayInEntrance;
import HomeWork6_3.Displey.ComputerDispley;
import HomeWork6_3.Displey.DispleyTV;
import HomeWork6_3.InterfacePrint.Printble;
import HomeWork6_3.Printer.InkjetPrinter;
import HomeWork6_3.Printer.LaserPrinter;
import HomeWork6_3.Printer.MultifunctionDevice;
import java.util.Scanner;

public class Main {

    static final String string1 = "\n1. Принтер\n2. Дисплей";
    static final String string2 = "\nВыбрите тип принтер для распечатки текста:\n1. Лазерный \n2. Струйный\n3. МФУ ";
    static final String string3 = "\nВыбрите экран для вывода информации:\n1. Экран телевизора \n2. Монитор копьютера\n3. Рекламный дисплей в подьезде";

    static boolean boo1 = true;
    static boolean boo2;
    static String scanString;
    static int scanInt1, scanInt3, scanInt4, scanInt5, scanInt6;
    private static Printble printble = null;

    public static void main(String[] args) {
        /**
         * NOTE! 6 следующих строк не нужны. Их можно заменить одной переменной
         * типа Printble
         *
         * -исправил!
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа вывода информации Приветствует вас!");
        restring();
        while (boo1) {
            scanner.reset();
            System.out.println("Выберите тип доступных устройств в сети:");
            System.out.println(string1);
            scanInt1 = scanner.nextInt();
            switch (scanInt1) {
                case 1:
                    System.out.println(string2);
                    scanInt3 = scanner.nextInt();
                    switch (scanInt3) {
                        case 1:
                            printble = new LaserPrinter();
                            toPrint();
                            while (boo2 == true) {
                                restring();
                                printble = new LaserPrinter();
                                toPrint();
                                continue;
                            }
                            break;
                        case 2:
                            printble = new InkjetPrinter();
                            toPrint();
                            while (boo2 == true) {
                                restring();
                                printble = new InkjetPrinter();
                                toPrint();
                                continue;
                            }
                            break;
                        case 3:
                            printble = new MultifunctionDevice();
                            printble.print(scanString);
                            while (boo2 == true) {
                                restring();
                                printble = new MultifunctionDevice();
                                toPrint();
                                continue;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println(string3);
                    scanInt4 = scanner.nextInt();
                    switch (scanInt4) {
                        case 1:
                            printble = new DispleyTV();
                            toPrint();
                            while (boo2 == true) {
                                restring();
                                printble = new DispleyTV();
                                toPrint();
                                continue;
                            }
                            break;
                        case 2:
                            printble = new ComputerDispley();
                            toPrint();
                            while (boo2 == true) {
                                restring();
                                printble = new ComputerDispley();
                                toPrint();
                                continue;
                            }
                            break;
                        case 3:
                            printble = new AdvertisingDisplayInEntrance();
                            toPrint();
                            while (boo2 == true) {
                                restring();
                                printble = new AdvertisingDisplayInEntrance();
                                toPrint();
                                continue;
                            }
                            break;
                    }
                    break;
                default:
                    System.exit(0);
                    scanner.close();
            }
            continue;
        }
    }

    /**
     * NOTE! Не мог бы ты объяснить почему сделал этот метод публичным? И
     * название метода не очень чистое.
     */
    // -исправил!
    private static void repeat() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\nХотите написать новый текст?\n1. Да\n2. Нет");
        scanInt5 = scanner1.nextInt();
        if (scanInt5 == 1) {
            System.out.println("\n1. Написать на этом устройстве\n2. Выбрать другое устройство");
            scanInt6 = scanner1.nextInt();
            switch (scanInt6) {
                case 1:
                    boo2 = true;
                    break;
                case 2:
                    boo2 = false;
                    break;
            }
        } else {
            System.out.println("\nДо новых встреч!");
            System.exit(0);
            scanner1.close();
        }
    }

    /**
     * NOTE! Не мог бы ты объяснить почему сделал этот метод публичным?
     */
    // -исправил!
    private static void restring() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\nНапишите ваш текст...");
        scanString = scanner2.nextLine();
    }

    private static void toPrint() {
        printble.print(scanString);
        repeat();
    }
}
