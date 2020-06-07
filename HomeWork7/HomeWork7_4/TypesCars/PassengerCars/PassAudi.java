package HomeWork7_4.TypesCars.PassengerCars;

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Passenger;


public class PassAudi extends Passenger {
     public PassAudi() {

        model = "Audi A6 Allroad";
        age = 2008;
        powereEngine = 240;
        colour = "Белый";
        fuelConsumption = 7.2;
        maxSpeed=233;
        typesCar="Универсал";
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
