package HomeWork5_3.TypesCars.PassengerCars;

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Passenger;

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
