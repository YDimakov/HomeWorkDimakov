package HomeWork5_1.gaming.model;

import HomeWork5_1.gaming.GamingLaptop;

public class GamingHP extends GamingLaptop {

    public GamingHP() {
        weight = 2250;
        model = "HP Pavilion Gaming 15-dk0000ur";
        cpu = "Intel Core i7-9750H";
        gpu = "NVIDIA GeForce GTX 1660Ti 6 ГБ";
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
        System.out.println(" Основной плюс данной модели - мощные комплектующие.\n При покупке HP Pavilion Gaming 15-dk0000ur сможешь играть в любые игры.");
    }
}
