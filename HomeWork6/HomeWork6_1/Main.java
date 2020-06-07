package HomeWork6_1;

import HomeWork6_1.ClassSort.Selection;
import HomeWork6_1.ClassSort.Babble;
import HomeWork6_1.ClassSort.Shell;
import HomeWork6_1.InterfaceSort.Sortable;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    final static String string1 = "\nПрограмма сортировки чисел Приветствут тебя!";
    final static String string2 = "\nКакое количество чисел будем сортировать?";
    final static String string3 = "\n 1: Продолжить?\n 2: Изменить числа?\n 3: Изменить количество чисел?";
    final static String string4 = "\nВыберите способ сортировки чисел?\n 1: Сортировка пузырьком\n 2: Сортировка методом выбора\n 3: Сортировка методом Шелла\n 0: Выход";
    final static String string5 = "\nВы ввели неверное число!\n";
    final static String string6 = "\n 1:Начнём всё сначало?\n 0:Выход";
    final static String string7 = "\nДо новых встреч!";
    final static String string8 = "\nСортируем по:\n 1:Возрастанию\n 2:Убыванию";
    static int scan1, scan2, scan3, scan4, scan5;
    static boolean boo1 = true;
    static boolean boo2 = true;
    static boolean boo3;

    public static void main(String[] args) {
        scanner.reset();

        /**
         * NOTE! 3 следующие строки не нужны. Их можно заменить одной переменной
         * типа Sortable
         * -исправил!
         */
        Sortable sort = null;
        System.out.println(string1);
        while (boo1) {
            boo2 = true;
            System.out.println(string2);
            scan1 = scanner.nextInt();

            while (boo2) {
                System.out.println("\nТеперь введи любые целые числа...");
                int[] userNumbers = numbersUzer();   //// мой массив

                System.out.print("\nВведённые числа: ");
                for (int i : userNumbers) {
                    System.out.print(i + " ");
                }
                System.out.println(string3);
                scan2 = scanner.nextInt();
                switch (scan2) {
                    case 1:
                        System.out.println(string4);
                        scan3 = scanner.nextInt();
                        switch (scan3) {
                            case 1:
                                System.out.println(string8);
                                scan4 = scanner.nextInt();
                                switch (scan4) {
                                    case 1:
                                        boo3 = true;
                                        sort = new Babble();
                                        break;
                                    case 2:
                                        boo3 = false;
                                        sort = new Babble();
                                        break;
                                    default:
                                        System.out.println(string5);
                                        scanner.close();
                                        System.exit(0);
                                }
                                sort.numbersSort(userNumbers, boo3);
                                result();
                                break;
                            case 2:
                                System.out.println(string8);
                                scan4 = scanner.nextInt();
                                switch (scan4) {
                                    case 1:
                                        boo3 = true;
                                        sort = new Selection();
                                        break;
                                    case 2:
                                        boo3 = false;
                                        sort = new Selection();
                                        break;
                                    default:
                                        System.out.println(string5);
                                        scanner.close();
                                        System.exit(0);
                                }
                                sort.numbersSort(userNumbers, boo3);
                                result();
                                break;
                            case 3:
                                System.out.println(string8);
                                scan4 = scanner.nextInt();
                                switch (scan4) {
                                    case 1:
                                        boo3 = true;
                                        sort = new Shell();
                                        break;
                                    case 2:
                                        boo3 = false;
                                        sort = new Shell();
                                        break;
                                    default:
                                        System.out.println(string5);
                                        scanner.close();
                                        System.exit(0);
                                }
                                sort.numbersSort(userNumbers, boo3);
                                result();
                                break;
                            case 0:
                                System.out.println(string7);
                                scanner.close();
                                System.exit(0);
                                break;
                        }
                        break;
                    case 2:
                        continue;
                    case 3:
                        boo2 = false;
                        continue;
                    default:
                        System.out.println(string5);
                        scanner.close();
                        System.exit(0);
                }

                break;
            }
            continue;
        }

    }

    /**
     * NOTE! Не мог бы ты объяснить почему сделал этот метод публичным?
     */
    // -исправил!
    private static int[] numbersUzer() {
        int[] numbers = new int[scan1];
        for (int i = 0; i < scan1; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    /**
     * NOTE! Не мог бы ты объяснить почему сделал этот метод публичным?
     */
    // -исправил!
    private static void result() {
        System.out.println(string6);
        scan5 = scanner.nextInt();
        switch (scan5) {
            case 1:
                boo2 = false;
                break;
            case 0:
                System.out.println(string7);
                scanner.close();
                System.exit(0);
            default:
                scanner.close();
                System.exit(0);
        }
    }
}
