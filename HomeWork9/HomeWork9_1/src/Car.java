public class Car extends Thread {
    private int loading;
    private int unloding;
    private String nameCar;
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public Car(int loading, int unloding,String nameCar) {
        this.loading = loading;
        this.unloding = unloding;
        this.nameCar=nameCar;
    }


    @Override
    public void run() {
        loadingCar(loading);
        moveCar();
        unloadingCar(unloding);
    }

    private void loadingCar(int loading) {
        synchronized (LOCK1) {
            System.out.println("Приступаем к загрузке товаров в "+nameCar);
            try {
                sleep(loading);
                System.out.println("Загрузка в "+nameCar+" закончилась!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moveCar() {
        System.out.println(nameCar+ " начал движение в сторону склада с разгрузкой");
        try {
            sleep(5000);
            System.out.println(nameCar+" приехал к складу с разгрузкой");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void unloadingCar(int unloding) {
        synchronized (LOCK2) {
            System.out.println(nameCar+" начал разгрузку");
            try {
                sleep(unloding);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nameCar+" разгрузился и уехал домой\n---------------------------");
        }
    }
}




