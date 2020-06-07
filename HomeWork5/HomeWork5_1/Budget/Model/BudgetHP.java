package HomeWork5_1.budget.model;

import HomeWork5_1.budget.BudgetLaprop;

public class BudgetHP extends BudgetLaprop {

    public BudgetHP() {
        cost = 245;
        model = "HP 250 G7";
        cpu = "Intel Celeron N4000";
        gpu = "Intel UHD Graphics 600";
        diagonal = 15.6;
        ram = 4;
    }

    @Override
    public void featuresLaptop() {
        System.out.println(modelString + model);
        System.out.println(diagonalString + diagonal);
        System.out.println(ramString + ram);
        System.out.println(gpuString + gpu);
        System.out.println(cpuString + cpu);
        System.out.println(costString + cost);
    }

    @Override
    public void budgetCost() {
        System.out.println(" Основной плюс данной модели -цена.\n При покупке HP 250 G7 сможешь смотреть фильмы, работать с документами и хранить данные.");
    }
}
