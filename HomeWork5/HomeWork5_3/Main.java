package HomeWork5_3;

import HomeWork5_3.TypesCars.Freight;
import HomeWork5_3.TypesCars.Passenger;
import java.util.Scanner;

public class Main {

    static final String string1 = "\nДобро пожаловать в энциклопедию автомобилей\n";
    static final String string2 = "Выберите тип автомобиля:\n  1 - грузовые\n  2 - легковые\n";
    static final String string3 = "\n 1-Назад\n 0-Выход";
    static final String string4 = "Вы ввели неверные данные!\n";
    static int scan1, scan2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Freight freight = new Freight();
        Passenger passenger = new Passenger();
        System.out.println(string1);
        while (true) {
            System.out.println(string2);
            scan1 = scanner.nextInt();
            switch (scan1) {
                case 1:
                    freight.infoFreightCars();
                    freight.info();
                    System.out.println(string3);
                    scan2 = scanner.nextInt();
                    switch (scan2) {
                        case 1:
                            break;
                        case 0:
                            scanner.close();
                            System.exit(0);
                        default:
                            System.out.println(string4);
                            break;
                    }   break;
                case 2:
                    passenger.infoPassengerCars();
                    passenger.info();
                    System.out.println(string3);
                    scan2 = scanner.nextInt();
                    switch (scan2) {
                        case 1:
                            break;
                        case 0:
                            scanner.close();
                            System.exit(0);
                        default:
                            System.out.println(string4);

                            break;
                    }   break;
                default:              
                    System.out.println(string4);
                    break;
            }
        }
    }
}
