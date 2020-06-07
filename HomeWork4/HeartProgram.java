// самый сок тут!!
package HomeWork4;

import java.util.Scanner;
import java.util.Arrays;

public class HeartProgram {

    /**
     * NOTE! 1) Некоторые статические поля тут лишние. Можно обойтись и обычными
     * полями ласса по той простой причине, что у тебя каждый новый объект
     * класса HeartProgram должен иметь свои собсвенные значения. Используя
     * статические поля ты создаешь их один раз и для все объектов.
     *
     * -исправил!
     *
     * 2) Модификаторы доступа не написал
     *
     * -испрвил!
     *
     * 3) у тебя часть текста в статических полях, а часть в коде. Надо
     * придерживаться какого-то одного подхода.
     *
     * -испрвил!
     *
     * 4) Описка в имени nomberPlayer
     *
     * -исправил!
     *
     * 5) Часть переменных, а может быть и все, нет смысла выносить в качестве
     * полей класса. Они живут только пока работает метод play. Потом они
     * становятся бессмысленными
     *
     * -исправил!
     *
     * 6) Метод play получился очень объемным, есть смысл его разбить на
     * несколько мелких методов
     *
     * -исправил!
     *
     * 7) неправильно использование модификаторов доступа для некоторых методов.
     * Они у тебя используются только внутри этого класса. Нет смысла открывать
     * к ним доступ.
     *
     * - исправил!
     *
     */
    private int[] array;
    private static int scan1, scan3;

    public static int getScan3() {
        return scan3;
    }

    public static int getScan1() {
        return scan1;
    }
    private int scan2;
    private boolean loser;
    private Player[] players;
    static Scanner scanner = new Scanner(System.in);

    public Player[] play(int number) {
        final String string4 = "Выберите игрока, чья комбинация вам понравилась больше...";// создаёт наших игроков
        players = new Player[number];
        /**
         * NOTE! Не вижу смысла от nomberPlayer. В качестве номера игрока можно
         * установить p+1.
         *
         * испрaвил!
         *
         */
        for (int p = 0; p < number; p++) {
            players[p] = new Player(p + 1, polzovRandomChisel());
            String strin = Arrays.toString(players[p].getArrayNumber());
            System.out.println("Игрок под номером " + players[p].getNomer() + ", его числа " + strin);
        }

        System.out.println("\n" + string4);
        scan2 = scanner.nextInt();
        Generator();
        /**
         * NOTE! Я бы завел булево поле к классе Player и устанавливал бы его в
         * true Если пользователь выбрал игрока. Тем самым ты избавишься от
         * избыточного поля player1. Потом просто можно пробежаться по всем
         * игрокам и найти выбранного, и проверить победил ли пользователь или
         * нет !
         *
         * исправил!
         */
        /**
         * NOTE! Если используешь булеву переменную в if, то ее не нужно
         * сравнивать ни с чем, просто используешь. по сути здесь тебе нужно
         * проверить что win ложный
         *
         * исправил!
         *
         */
        checkPlayer();
        replay();
        return players;
    }

    void gamer() {
        final String string3 = "Введите количество участников!!!";// метод ввода игроков
        System.out.println("\n" + string3);
        scan1 = scanner.nextInt();
    }

    private void Generator() {
        array = NumberGenerator.generateNumbers(6);  // создание победной комбинации, её можно менять в зависимости от требований
        String arrayToString3 = Arrays.toString(array);
        System.out.println("\nПобедная комбинация:  " + arrayToString3);
    }

    private int[] polzovRandomChisel() {  // метод генерации чисел для наших игроков, его можно менять в зависимости от требований
        return NumberGenerator.generateNumbers(3);
    }

    private void replay() {
        final String string5 = "\nСыграем ещё?\n 1-Да.\n 0-Нет.";// метод повтора игры
        System.out.println(string5);
        scan3 = scanner.nextInt();
        scanner.reset();
    }

    private void choicePlayer() {    // выбираем себе игрока.
        for (Player player : players) {
            if (player.getNomer() == scan2) {
                player.win(true);
                String toString1 = Arrays.toString(player.getArrayNumber());
                System.out.println("Ваш игрок " + player.getNomer() + " и его комбинация" + toString1 + "\n");
            }
        }
    }

    private void checkPlayer() { // проверяем игроков на статус победы
        int number = 0;
        choicePlayer();
        for (Player player : players) {
            for (int r = 0; r < player.getArrayNumber().length; r++) {
                for (int d = 0; d < array.length; d++) {
                    if (player.getArrayNumber()[r] == array[d]) {
                        number += 1;
                        if (number == 2) {
                            if (player.win()) {
                                String arrayToString = Arrays.toString(player.getArrayNumber());
                                System.out.print("Выбранный вами игрок - " + player.getNomer() + " с комбинацией" + arrayToString + "Выиграл!\n");
                                number = 0;
                                loser = true;
                                break;
                            } else {
                                String arrayToString = Arrays.toString(player.getArrayNumber());
                                System.out.print("Победил игрок под номером - " + player.getNomer() + ", и его победная комбинация" + arrayToString + "\n");
                                number = 0;
                                loser = true;
                            }
                        }
                        break;
                    } else {
                        number = 0;
                    }
                }
            }
            number = 0;
        }
        if (!loser) {
            System.out.println("Никто из игроков не выиграл!");
        }
    }
}
