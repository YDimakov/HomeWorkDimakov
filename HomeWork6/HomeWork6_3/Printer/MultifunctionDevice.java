package HomeWork6_3.Printer;

import HomeWork6_3.ClassAbstract.Printer;
import HomeWork6_3.InterfacePrint.Printble;

public class MultifunctionDevice extends Printer implements Printble {

    public MultifunctionDevice() {
        model = "Epson XP-3100";
    }

    @Override
    public void print(String string) {
        System.out.println("Принтер " + model + " напечатал следующей текст: " + string);
    }
}
