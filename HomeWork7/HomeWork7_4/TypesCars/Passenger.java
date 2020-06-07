package HomeWork7_4.TypesCars;

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.PassengerCars.*;

import java.util.Arrays;
import java.util.List;

public class Passenger extends Car {

    static public void info() {
        Car pAudi = new PassAudi();
        Car pBMW = new PassBMW();
        Car pMers = new PassMercedes();
        Car pMini = new PassMini();
        Car pMersLim = new PassMersLim();

        /** NOTE! Arrays.asList уже возвращает List. Нет необходимости
         * создавать еще и ArrayList */
        List<Car> passengerArrayList = Arrays.asList(pAudi, pBMW, pMers, pMini, pMersLim);
        for (int i = 0; i < passengerArrayList.size(); i++) {
            passengerArrayList.get(i).infoCars();
            System.out.println(" ");
        }
    }
}
