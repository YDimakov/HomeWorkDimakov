package HomeWork7_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class HeartProgram {

    private ArrayList array;
    private ArrayList myNumber;
    private static int scan1, scan3;

    public static int getScan3() {
        return scan3;
    }

    public static int getScan1() {
        return scan1;
    }

    private int scan2;
    private boolean loser;

    /**
     * NOTE! От этого массива можно избавиться. Ты все равно используешь
     * коллекции.
     */
    /**
     * NOTE! Не зачту работу пока не исправишь, две строки ниже.
     * Специально не буду говорить что тут не так.
     */
    static Scanner scanner = new Scanner(System.in);
    HashMap<Integer, ArrayList> hashMapPlayers = new HashMap<>();


    public HashMap play(int number) {
        final String string4 = "Выберите игрока, чья комбинация вам понравилась больше...";// создаёт наших игроков
        for (int p = 1; p <= number; p++) {
            hashMapPlayers.put(p, polzovRandomChisel());
            System.out.println("Игрок под номером " + p + ", его числа " + hashMapPlayers.get(p));
        }
        System.out.println("\n" + string4);
        scan2 = scanner.nextInt();
        Generator();
        checkPlayer();
        replay();
        return hashMapPlayers;
    }

    void gamer() {
        final String string3 = "Введите количество участников!!!";// метод ввода игроков
        System.out.println("\n" + string3);
        scan1 = scanner.nextInt();
    }

    private void Generator() {
        array = NumberGenerator.generateNumbers(6);  // создание победной комбинации, её можно менять в зависимости от требований
        System.out.println("\nПобедная комбинация:  " + array);
    }

    private ArrayList polzovRandomChisel() {  // метод генерации чисел для наших игроков, его можно менять в зависимости от требований
        return NumberGenerator.generateNumbers(2);
    }

    private void replay() {
        final String string5 = "\nСыграем ещё?\n 1-Да.\n 0-Нет.";// метод повтора игры
        System.out.println(string5);
        scan3 = scanner.nextInt();
        scanner.reset();
    }

    private void choicePlayer() {    // выбираем себе игрока.
        for (int i = 0; i < hashMapPlayers.size(); i++) {
            if (hashMapPlayers.containsKey(scan2)) {
                myNumber = hashMapPlayers.get(scan2);
            }
        }
        System.out.println("\nВаш игрок " + scan2 + " и его комбинация" + myNumber + "\n");
    }


    private void checkMyPlayer() { // проверяем нашего игрока
        int number1 = 0;
        for (int i = 0; i < hashMapPlayers.size(); i++) {
            for (int d = 0; d < array.size(); d++) {
                for (int r = 0; r < myNumber.size(); r++) {
                    if ((array.get(d) == myNumber.get(r))) {
                        number1 += 1;
                        if (number1 == 2) {
                            System.out.print("Выбранный вами игрок - " + i + " с комбинацией" + myNumber + "Выиграл!\n");
                        }
                    }
                }
            }
        }
    }


    private void checkPlayer() { // проверяем игроков на статус победы
        int number2 = 0;
        choicePlayer();
        checkMyPlayer();
        for (int i = 0; i < hashMapPlayers.size(); i++) {
            for (int d = 0; d < array.size(); d++) {
                ArrayList arNumber = hashMapPlayers.get(i + 1);
                for (int r = 0; r < arNumber.size(); r++) {
                    if ((array.get(d) == arNumber.get(r))) {
                        number2 += 1;
                        if (number2 == 2) {
                            System.out.print("Победил игрок под номером - " + i + ", и его победная комбинация" + arNumber + "\n");
                            number2 = 0;
                            loser = true;
                        }
                        continue;
                    } else {
                        number2 = 0;
                    }
                }
            }
            number2 = 0;
        }
        if (!loser) {
            System.out.println("Никто из игроков не выиграл!");
        }
    }
}