package HomeWork5_2;

import HomeWork5_2.Sabordintes.СhiefAccountant;
import HomeWork5_2.Sabordintes.Engineer;
import HomeWork5_2.Guide.DeputyHead;
import HomeWork5_2.Guide.ChiefEngineer;
import HomeWork5_2.Guide.Chief;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Chief chief = new Chief();
        ChiefEngineer ce = new ChiefEngineer();
        DeputyHead dh = new DeputyHead();
        Engineer eng = new Engineer();
        СhiefAccountant ca = new СhiefAccountant();

        emp.info();
        System.out.println("");
        chief.info();
        chief.duties();
        System.out.println("");
        ce.info();
        ce.duties();
        System.out.println("");
        dh.info();
        dh.duties();
        System.out.println("");
        eng.info();
        eng.duties();
        System.out.println("");
        ca.info();
        ca.duties();
    }
}
