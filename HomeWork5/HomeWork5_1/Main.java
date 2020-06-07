package HomeWork5_1;

import HomeWork5_1.budget.BudgetLaprop;
import HomeWork5_1.budget.model.BudgetHP;
import HomeWork5_1.gaming.GamingLaptop;
import HomeWork5_1.budget.model.BudgetLenovo;
import HomeWork5_1.gaming.model.GamingHP;
import HomeWork5_1.gaming.model.GamingLenovo;

public class Main {

    public static void main(String[] args) {
        Laptop lap = new Laptop();
        GamingLaptop gamingLap = new GamingLaptop();
        BudgetLaprop budgetLap = new BudgetLaprop();
        BudgetLenovo budgetLev = new BudgetLenovo();
        BudgetHP budgetHP = new BudgetHP();
        GamingLenovo gaminglev = new GamingLenovo();
        GamingHP gamingHP = new GamingHP();

        lap.featuresLaptop();
        System.out.println();
        gamingLap.startGame();
        System.out.println();
        gaminglev.featuresLaptop();
        gaminglev.startGame();
        System.out.println();
        gamingHP.featuresLaptop();
        gamingHP.startGame();
        System.out.println();
        budgetLap.budgetCost();
        System.out.println();
        budgetLev.featuresLaptop();
        budgetLev.budgetCost();
        System.out.println();
        budgetHP.featuresLaptop();
        budgetHP.budgetCost();
    }

}
