package HomeWork5_3.TypesCars;

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.PassengerCars.PassAudi;
import HomeWork5_3.TypesCars.PassengerCars.PassBMW;
import HomeWork5_3.TypesCars.PassengerCars.PassMercedes;
import HomeWork5_3.TypesCars.PassengerCars.PassMersLim;
import HomeWork5_3.TypesCars.PassengerCars.PassMini;

public class Passenger extends Car {

    protected int maxSpeed;
    protected String typesCar;
    protected final String typesCarString = " Кузов: ";
    protected final String maxSpeedString = " Максимальная скорость(км): ";

    public void infoPassengerCars() {
        System.out.println("Краткая характеристика легковых автомобилей\n");
    }

    public void info() {
        PassAudi pAudi = new PassAudi();
        PassBMW pBMW = new PassBMW();
        PassMercedes pMers = new PassMercedes();
        PassMini pMini = new PassMini();
        PassMersLim pMersLim = new PassMersLim();

        pAudi.infoPassengerCars();
        System.out.println("");
        pBMW.infoPassengerCars();
        System.out.println("");
        pMers.infoPassengerCars();
        System.out.println("");
        pMini.infoPassengerCars();
        System.out.println("");
        pMersLim.infoPassengerCars();
        System.out.println("");

    }
}
