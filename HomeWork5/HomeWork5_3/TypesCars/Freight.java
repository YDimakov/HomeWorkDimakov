package HomeWork5_3.TypesCars;

import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.FreightCars.DumpTruck;
import HomeWork5_3.TypesCars.FreightCars.GrainTruck;
import HomeWork5_3.TypesCars.FreightCars.LorryCar;
import HomeWork5_3.TypesCars.FreightCars.TankTruck;
import HomeWork5_3.TypesCars.FreightCars.TimberTruck;

public class Freight extends Car {

    protected int carryingCapacity;
    protected int carWeight;
    protected final String carryingCapacityString = " Грузоподъёмность(кг): ";
    protected final String carWeightString = " Вес(кг):";

    public void infoFreightCars() {
        System.out.println("Краткая характеристика грузовых автомобилей\n");
    }

    public void info() {
        DumpTruck dump = new DumpTruck();
        GrainTruck grain = new GrainTruck();
        LorryCar lorry = new LorryCar();
        TankTruck tank = new TankTruck();
        TimberTruck timber = new TimberTruck();

        dump.infoFreightCars();
        System.out.println("");
        grain.infoFreightCars();
        System.out.println("");
        lorry.infoFreightCars();
        System.out.println("");
        tank.infoFreightCars();
        System.out.println("");
        timber.infoFreightCars();
        System.out.println("");
    }

}
