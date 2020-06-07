package HomeWork5_3;

public class Car {

    protected String model;
    protected int age;
    protected int powereEngine;
    protected String colour;
    protected double fuelConsumption;

    protected final String modelString = " Модель: ";
    protected final String ageString = " Год выпуска: ";
    protected final String engineString = " Мощность двигателя л.с.(кВт): ";
    protected final String colourString = " Цвет: ";
    protected final String fuelConsumptionString = " Средний расход топлива(л/ч): ";

    public double infoPower(int powereEngine) {
        return powereEngine /= 1.36;
    }
}
