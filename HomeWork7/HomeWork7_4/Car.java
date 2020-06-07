package HomeWork7_4;

public class Car {

    protected String model;
    protected int age;
    protected int powereEngine;
    protected String colour;
    protected double fuelConsumption;
    protected int carryingCapacity;
    protected int carWeight;
    protected int maxSpeed;
    protected String typesCar;

    protected final String TYPESCARSTRING = " Кузов: ";
    protected final String MAXSPEEDCARSRING = " Максимальная скорость(км): ";
    protected final String CARRYINGCAPACITYSTRING = " Грузоподъёмность(кг): ";
    protected final String CARWEIGHTTRING = " Вес(кг):";
    protected final String MODELSTRING = " Модель: ";
    protected final String AGESTRING = " Год выпуска: ";
    protected final String ENGINESTRING = " Мощность двигателя л.с.(кВт): ";
    protected final String COLOURSTRING = " Цвет: ";
    protected final String FUELCOMSUMPTIONSTRING = " Средний расход топлива(л/ч): ";

    public double infoPower(int powereEngine) {

        return powereEngine /= 1.36;
    }

    public void infoCars() {
        System.out.println("Краткая характеристика автомобилей\n");
    }
}
