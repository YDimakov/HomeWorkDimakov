package HomeWork4;

public class Main {

    public static void main(String[] args) {
        final String string1 = "Добро пожаловать в Loto-Gold";
        final String string2 = "Для победы вам необходимо угадать 3 числа";
        
        boolean game = true;
        HeartProgram hp = new HeartProgram();
        System.out.println(string1);
        System.out.println(string2);
        while (game) {    // зацыкливает наши методы для повторного запуска
            hp.gamer();
            hp.play(HeartProgram.getScan1());
            /**
             * NOTE! Здесь можно написать проще. Вообще не стоит писать пустые
             * конструкции наподобие той, что ты написал исправил!
             */
            if (HeartProgram.getScan3() == 1) {
                continue;
            } else {
                System.out.println("\nДо новых встреч");
                System.exit(0);
                HeartProgram.scanner.close();
            }
        }
    }
}
