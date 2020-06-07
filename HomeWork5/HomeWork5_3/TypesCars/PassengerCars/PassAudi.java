
package HomeWork5_3.TypesCars.PassengerCars;

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Passenger;


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
    public void infoPassengerCars() {
        Car car = new Car();
        System.out.println(modelString + model);
        System.out.println(ageString + age);
        System.out.println(engineString + powereEngine + "(" + car.infoPower(powereEngine) + ")");
        System.out.println(colourString + colour);
        System.out.println(fuelConsumptionString + fuelConsumption);
        System.out.println(maxSpeedString+maxSpeed);
        System.out.println(typesCarString+typesCar);
    }
}
