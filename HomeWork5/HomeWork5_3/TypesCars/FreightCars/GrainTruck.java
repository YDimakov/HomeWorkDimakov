package HomeWork5_3.TypesCars.FreightCars;
// зерновоз
import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Freight;

public class GrainTruck extends Freight {

    public GrainTruck() {
        model = "МАЗ-6501";
        age = 2013;
        powereEngine = 412;
        colour = "Жёлтый с белым";
        fuelConsumption = 26;
        carryingCapacity = 14500;
        carWeight = 19000;
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
