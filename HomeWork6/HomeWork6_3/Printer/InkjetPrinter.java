package HomeWork6_3.Printer;

import HomeWork6_3.ClassAbstract.Printer;
import HomeWork6_3.InterfacePrint.Printble;

public class InkjetPrinter extends Printer implements Printble {

    public InkjetPrinter() {
        model="Canon Pixma G1411";
    }

    @Override
    public void print(String string) {
        System.out.println("Принтер " + model + " напечатал следующей текст: " + string);
    }
}
