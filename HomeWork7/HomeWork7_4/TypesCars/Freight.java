package HomeWork7_4.TypesCars;

import HomeWork7_4.Car;
import HomeWork7_4.TypesCars.FreightCars.*;

import java.util.Arrays;
import java.util.List;

public class Freight extends Car {

    public void info() {
        Car dump = new DumpTruck();
        Car grain = new GrainTruck();
        Car lorry = new LorryCar();
        Car tank = new TankTruck();
        Car timber = new TimberTruck();

        List<Car> freightList = Arrays.asList(dump, grain, lorry, tank, timber);
        for (int i = 0; i < freightList.size(); i++) {
            freightList.get(i).infoCars();
            System.out.println(" ");
        }
    }
}
