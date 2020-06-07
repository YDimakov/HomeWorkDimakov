package HomeWork5_1.budget;

import HomeWork5_1.Laptop;

public class BudgetLaprop extends Laptop{
    
    protected int cost;
    protected final String costString = " Стоимость($) - ";
    
    public void budgetCost() {
        System.out.println("Это бюджетные ноутбуки:");
    }

}
