package HomeWork6_3.Displey;

import HomeWork6_3.ClassAbstract.Display;
import HomeWork6_3.InterfacePrint.Printble;

public class ComputerDispley extends Display implements Printble {

    public ComputerDispley() {
        model="LG 25UM58-P";
    }

    @Override
    public void print(String string) {
        System.out.println("Монитор " + model + " вывел на экран следующей текст: " + string);
    }
}
