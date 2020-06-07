package HomeWork7_4.TypesCars.FreightCars;
//самосвал 

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Freight;

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
    public void infoCars() {
        Car car = new Car();
        System.out.println(MODELSTRING + model);
        System.out.println(AGESTRING + age);
        System.out.println(ENGINESTRING + powereEngine + "(" + car.infoPower(powereEngine) + ")*2");
        System.out.println(COLOURSTRING + colour);
        System.out.println(FUELCOMSUMPTIONSTRING + fuelConsumption);
        System.out.println(CARRYINGCAPACITYSTRING + carryingCapacity);
        System.out.println(CARWEIGHTTRING + carWeight);
    }

}
