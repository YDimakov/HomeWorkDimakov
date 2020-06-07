package HomeWork5_3.TypesCars.PassengerCars;

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Passenger;

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
