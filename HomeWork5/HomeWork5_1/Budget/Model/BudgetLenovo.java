package HomeWork5_1.budget.model;

import HomeWork5_1.budget.BudgetLaprop;

public class BudgetLenovo extends BudgetLaprop {

   public BudgetLenovo() {
        cost=230;
        model = "Lenovo ideapad S145-15AST";
        cpu = "AMD A4-9125";
        gpu = "AMD Radion R3 Graphics";
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
        System.out.println(" Основной плюс данной модели -цена.\n При покупке Lenovo ideapad S145-15AST сможешь смотреть фильмы, работать с документами и хранить данные.");
    }
}
