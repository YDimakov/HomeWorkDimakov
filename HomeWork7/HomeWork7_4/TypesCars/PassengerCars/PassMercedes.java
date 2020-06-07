package HomeWork7_4.TypesCars.PassengerCars;

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Passenger;

public class PassMercedes extends Passenger {

    public PassMercedes() {

        model = "Mercedes-Benz S 600 L";
        age = 1991;
        powereEngine = 394;
        colour = "Cерый";
        fuelConsumption = 13.7;
        maxSpeed = 250;
        typesCar = "Седан";
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
