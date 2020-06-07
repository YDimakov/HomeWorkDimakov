package HomeWork5_3.TypesCars.FreightCars;
// городской грузовой автомобиль
import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Freight;

public class LorryCar extends Freight {

    public LorryCar() {
        model = "ГАЗ 33022";
        age = 1994;
        powereEngine = 110;
        colour = "Белый";
        fuelConsumption = 13;
        carryingCapacity = 1500;
        carWeight = 1850;
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
