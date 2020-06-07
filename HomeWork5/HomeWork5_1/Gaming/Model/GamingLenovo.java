package HomeWork5_1.gaming.model;

import HomeWork5_1.gaming.GamingLaptop;

public class GamingLenovo extends GamingLaptop {

    public GamingLenovo() {
        weight = 2300;
        model = "Lenovo Legion Y530-15ICH";
        cpu = "Intel Core i5-8300H";
        gpu = "NVIDIA GeForce GTX 1050 4 ГБ";
        diagonal = 15.6;
        ram = 16;
    }

    @Override
    public void featuresLaptop() {
        System.out.println(modelString + model);
        System.out.println(diagonalString + diagonal);
        System.out.println(ramString + ram);
        System.out.println(gpuString + gpu);
        System.out.println(cpuString + cpu);
        System.out.println(weightString + weight);
    }

    @Override
    public void startGame() {
        System.out.println(" Основной плюс данной модели - начинка.\n При покупке Lenovo Legion Y530-15ICH сможешь играть в любые игры.");
    }

}
