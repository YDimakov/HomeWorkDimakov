import java.util.concurrent.Semaphore;

public class Main {
    public static WorkCar workCar;

    public static void main(String[] args) {
        Semaphore semLoad = new Semaphore(5);
        Semaphore semUn = new Semaphore(2);
        workCar = new WorkCar(semLoad, semUn, 2000, 1000, "МАЗ-1");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 2000, 1000, "МАЗ-2");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 2000, 1000, "МАЗ-3");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 2000, 1000, "МАЗ-4");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 2000, 1000, "МАЗ-5");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-1");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-2");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-3");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-4");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-5");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-6");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-7");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-8");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-9");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 6000, 1000, "КАМАЗ-10");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 10000, 1000, "БЕЛАЗ-1");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 10000, 1000, "БЕЛАЗ-2");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 10000, 1000, "БЕЛАЗ-3");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 10000, 1000, "БЕЛАЗ-4");
        workCar.start();

        workCar = new WorkCar(semLoad, semUn, 10000, 1000, "БЕЛАЗ-5");
        workCar.start();
    }
}
