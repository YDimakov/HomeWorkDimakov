package HomeWork7_4.TypesCars.PassengerCars;

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Passenger;

public class PassMersLim extends Passenger {

    public PassMersLim() {

        model = "Mercedes-Benz E280";
        age = 2015;
        powereEngine = 193;
        colour = "Черный";
        fuelConsumption = 10.5;
        maxSpeed = 215;
        typesCar = "Лимузин";
    }

    @Override
    public void infoCars() {
        Car car = new Car();
        System.out.println(MODELSTRING + model);
        System.out.println(AGESTRING + age);
        System.out.println(ENGINESTRING + powereEngine + "(" + car.infoPower(powereEngine) + ")");
        System.out.println(COLOURSTRING + colour);
        System.out.println(FUELCOMSUMPTIONSTRING + fuelConsumption);
        System.out.println(MAXSPEEDCARSRING+maxSpeed);
        System.out.println(TYPESCARSTRING+typesCar);
    }
}
