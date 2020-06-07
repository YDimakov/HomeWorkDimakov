package HomeWork6_3.Displey;

import HomeWork6_3.ClassAbstract.Display;
import HomeWork6_3.InterfacePrint.Printble;

public class DispleyTV extends Display implements Printble {

    public DispleyTV() {
        model="Xiaomi MI TV 50";
    }

    @Override
    public void print(String string) {
        System.out.println("Телевизор " + model + " вывел на экран следующей текст: " + string);
    }
}
