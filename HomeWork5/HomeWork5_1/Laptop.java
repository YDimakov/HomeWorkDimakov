package HomeWork5_1;

public class Laptop {

    protected String model;
    protected String cpu;
    protected String gpu;
    protected double diagonal;
    protected int ram;
    protected final String modelString = "Краткая характеристика ноутбука:\n Модель - ";
    protected final String cpuString = " Модель процессора - ";
    protected final String gpuString = " Графический адаптер - ";
    protected final String diagonalString = " Диагональ экрана(дюйм) - ";
    protected final String ramString = " Обьём памяти(ГБ)- ";

    public void featuresLaptop() {
        System.out.println("Узнаем информацию о ноутбуках! ");
    }

}
