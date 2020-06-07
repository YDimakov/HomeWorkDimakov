package HomeWork7_3;
public class Main {

    public static void main(String[] args) {
        final String string1 = "Добро пожаловать в Loto-Gold";
        final String string2 = "Для победы вам необходимо угадать 2 числа";
        
        boolean game = true;
        HeartProgram hp = new HeartProgram();
        System.out.println(string1);
        System.out.println(string2);
        while (game) {    // зацыкливает наши методы для повторного запуска
            hp.gamer();
            hp.play(HeartProgram.getScan1());
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
