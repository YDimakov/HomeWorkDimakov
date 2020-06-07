package HomeWork6_3.Displey;

import HomeWork6_3.ClassAbstract.Display;
import HomeWork6_3.InterfacePrint.Printble;

public class AdvertisingDisplayInEntrance extends Display implements Printble {

    public AdvertisingDisplayInEntrance() {
        model = "ADM421m";
    }

    @Override
    public void print(String string) {
        System.out.println("Рекламный дисплей в подьезде " + model + " вывел следующей текст: " + string);
    }

}
