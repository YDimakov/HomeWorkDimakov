public class Main {
    private static Car car;

    public static void main(String[] args) throws InterruptedException {

        car = new Car(2000, 1000, "МАЗ-1");
        car.start();


        car = new Car(2000, 1000, "МАЗ-2");
        car.start();

        car = new Car(6000, 1000, "КАМАЗ-1");
        car.start();

        car = new Car(6000, 1000, "КАМАЗ-2");
        car.start();

        car = new Car(6000, 1000, "КАМАЗ-3");
        car.start();

        car = new Car(6000, 1000, "КАМАЗ-4");
        car.start();

        car = new Car(6000, 1000, "КАМАЗ-5");
        car.start();

        car = new Car(10000, 1000, "БЕЛАЗ-1");
        car.start();

        car = new Car(10000, 1000, "БЕЛАЗ-2");
        car.start();

        car = new Car(10000, 1000, "БЕЛАЗ-3");
        car.start();

    }
}
