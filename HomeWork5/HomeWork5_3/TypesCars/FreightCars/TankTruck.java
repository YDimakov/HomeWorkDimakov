package HomeWork5_3.TypesCars.FreightCars;
//автоцистерна

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Freight;

public class TankTruck extends Freight {

    public TankTruck() {
        model = "КАМАЗ 65115";
        age = 1995;
        powereEngine = 282;
        fuelConsumption = 29;
        colour = "Оранжевый";
        carryingCapacity = 19000;
        carWeight = 10050;
    }

    @Override
    public void infoFreightCars() {
        Car car = new Car();
        System.out.println(modelString + model);
        System.out.println(ageString + age);
        System.out.println(engineString + powereEngine + "(" + car.infoPower(powereEngine) + ")");
        System.out.println(colourString + colour);
        System.out.println(fuelConsumptionString + fuelConsumption);
        System.out.println(carryingCapacityString + carryingCapacity);
        System.out.println(carWeightString + carWeight);
    }

}
