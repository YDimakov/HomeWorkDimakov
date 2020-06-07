import java.util.concurrent.Semaphore;

public class WorkCar extends Thread {
    private int loading;
    private int unloding;
    private String nameCar;
    private Semaphore semaphore1;
    private Semaphore semaphore2;
    private boolean boo1;
    private boolean boo2;

    public WorkCar(Semaphore semaphore1, Semaphore semaphore2, int loading, int unloding, String nameCar) {
        this.semaphore1 = semaphore1;
        this.semaphore2 = semaphore2;
        this.loading = loading;
        this.unloding = unloding;
        this.nameCar = nameCar;
    }

    @Override
    public void run() {
        if (!boo1) {
            try {
                semaphore1.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            loadingCar(loading);
            boo1 = true;
            semaphore1.release();
        }
        moveCar();
        if (!boo2) {
            try {
                semaphore2.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            unloadingCar(unloding);
            boo2 = true;
            semaphore2.release();
        }
    }

    private void loadingCar(int loading) {

        System.out.println("Приступаем к загрузке товаров в " + nameCar);
        try {
            sleep(loading);
            System.out.println("Загрузка в " + nameCar + " закончилась!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void moveCar() {
        System.out.println(nameCar + " начал движение в сторону склада");
        try {
            sleep(5000);
            System.out.println(nameCar + " приехал к складу");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void unloadingCar(int unloding) {

        System.out.println(nameCar + " начал разгрузку в складе");
        try {
            sleep(unloding);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nameCar + " разгрузился и уехал домой!\n---------------------------");
    }
}




