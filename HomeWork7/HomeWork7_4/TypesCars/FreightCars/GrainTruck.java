package HomeWork7_4.TypesCars.FreightCars;
// зерновоз
import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Freight;

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
