package HomeWork5_3.TypesCars.FreightCars;
//лесовоз
import HomeWork5_3.Car;
import HomeWork5_3.TypesCars.Freight;

public class TimberTruck extends Freight {

    public TimberTruck() {
        model = "Урал-4320";
        age = 1986;
        powereEngine = 230;
        colour = "Тёмно-зелёный";
        fuelConsumption = 32;
        carryingCapacity = 12000;
        carWeight = 8000;
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
