package HomeWork5_3.TypesCars.PassengerCars;

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Passenger;

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
