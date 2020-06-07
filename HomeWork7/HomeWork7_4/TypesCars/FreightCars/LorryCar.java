package HomeWork7_4.TypesCars.FreightCars;
// городской грузовой автомобиль
import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Freight;

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
