package HomeWork7_4;

import HomeWork7_4.TypesCars.Freight;
import HomeWork7_4.TypesCars.Passenger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int scan1, scan2;
        final String STRING1 = "\nДобро пожаловать в энциклопедию автомобилей\n";
        final String STRING2 = "Выберите тип автомобиля:\n  1 - грузовые\n  2 - легковые\n";
        final String STRING3 = "\n 1-Назад\n 0-Выход";
        final String STRING4 = "Вы ввели неверные данные!\n";
        Scanner scanner = new Scanner(System.in);
        Freight freight = new Freight();
        Passenger passenger = new Passenger();
        System.out.println(STRING1);
        while (true) {
            System.out.println(STRING2);
            scan1 = scanner.nextInt();
            switch (scan1) {
                case 1:
                    freight.infoCars();
                    freight.info();
                    System.out.println(STRING3);
                    scan2 = scanner.nextInt();
                    switch (scan2) {
                        case 1:
                            break;
                        case 0:
                            scanner.close();
                            System.exit(0);
                        default:
                            System.out.println(STRING4);
                            break;
                    }
                    break;
                case 2:
                    passenger.infoCars();
                    passenger.info();
                    System.out.println(STRING3);
                    scan2 = scanner.nextInt();
                    switch (scan2) {
                        case 1:
                            break;
                        case 0:
                            scanner.close();
                            System.exit(0);
                        default:
                            System.out.println(STRING4);
                            break;
                    }
                    break;
                default:
                    System.out.println(STRING4);
                    break;
            }
        }
    }
}
