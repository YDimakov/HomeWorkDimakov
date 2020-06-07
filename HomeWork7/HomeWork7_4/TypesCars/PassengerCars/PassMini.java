package HomeWork7_4.TypesCars.PassengerCars;

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Passenger;

public class PassMini extends Passenger {

    public PassMini() {

        model = "MINI CABRIO";
        age = 2015;
        powereEngine = 136;
        colour = "Берюзовый";
        fuelConsumption = 4.9;
        maxSpeed = 208;
        typesCar = "Кабриолет";
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
