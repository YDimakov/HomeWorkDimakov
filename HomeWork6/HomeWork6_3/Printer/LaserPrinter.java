package HomeWork6_3.Printer;

import HomeWork6_3.ClassAbstract.Printer;
import HomeWork6_3.InterfacePrint.Printble;

public class LaserPrinter extends Printer implements Printble {

    public LaserPrinter() {
        model="HP Laser 107r";
    }

    @Override
    public void print(String string) {
        System.out.println("Принтер " + model + " напечатал следующей текст: " + string);
    }
}
