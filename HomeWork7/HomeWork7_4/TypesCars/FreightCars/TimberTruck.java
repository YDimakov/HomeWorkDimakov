package HomeWork7_4.TypesCars.FreightCars;
//лесовоз
import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.Freight;

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
