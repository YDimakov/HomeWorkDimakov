package HomeWork5_3.TypesCars.FreightCars;
//самосвал 

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Freight;

public class DumpTruck extends Freight {

    public DumpTruck() {
        model = "БелАЗ-75710";
        age = 2008;
        powereEngine = 2300;
        colour = "Оранжевый с синим";
        fuelConsumption = 1300;
        carryingCapacity = 450000;
        carWeight = 360000;
    }

    @Override
    public void infoFreightCars() {
        Car car = new Car();
        System.out.println(modelString + model);
        System.out.println(ageString + age);
        System.out.println(engineString + powereEngine + "(" + car.infoPower(powereEngine) + ")*2");
        System.out.println(colourString + colour);
        System.out.println(fuelConsumptionString + fuelConsumption);
        System.out.println(carryingCapacityString + carryingCapacity);
        System.out.println(carWeightString + carWeight);
    }

}
