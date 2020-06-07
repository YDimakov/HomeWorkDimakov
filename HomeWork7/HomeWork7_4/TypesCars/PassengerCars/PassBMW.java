package HomeWork7_4.TypesCars.PassengerCars;

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Passenger;

public class PassBMW extends Passenger {

    public PassBMW() {

        model = "BMW 530i Touring";
        age = 2007;
        powereEngine = 272;
        colour = "Чёрный";
        fuelConsumption = 7.9;
        maxSpeed = 250;
        typesCar = "Универсал(E60)";
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
