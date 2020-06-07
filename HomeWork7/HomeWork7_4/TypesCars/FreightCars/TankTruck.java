package HomeWork7_4.TypesCars.FreightCars;
//автоцистерна

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Freight;

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
    public void infoCars() {
        Car car = new Car();
        System.out.println(MODELSTRING + model);
        System.out.println(AGESTRING + age);
        System.out.println(ENGINESTRING + powereEngine + "(" + car.infoPower(powereEngine) + ")");
        System.out.println(COLOURSTRING + colour);
        System.out.println(FUELCOMSUMPTIONSTRING + fuelConsumption);
        System.out.println(CARRYINGCAPACITYSTRING + carryingCapacity);
        System.out.println(CARWEIGHTTRING + carWeight);
    }

}
