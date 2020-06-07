package HomeWork5_3.TypesCars.PassengerCars;

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Passenger;

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
    public void infoPassengerCars() {
        Car car = new Car();
        System.out.println(modelString + model);
        System.out.println(ageString + age);
        System.out.println(engineString + powereEngine + "(" + car.infoPower(powereEngine) + ")");
        System.out.println(colourString + colour);
        System.out.println(fuelConsumptionString + fuelConsumption);
        System.out.println(maxSpeedString + maxSpeed);
        System.out.println(typesCarString + typesCar);
    }
}
