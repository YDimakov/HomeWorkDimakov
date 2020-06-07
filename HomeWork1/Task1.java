  

/**
 * Задание № 1
 *
 * 1) Написать алгоритмы конвертации физических величин. Код должен быть написан
 * в соответствующих функциях вместо комментария со вловом TODO
 *
 * 2) Написать 2-3 собственные функции по конвертированию величин. Результат
 * вывести в консоль с помощью команды System.out.println(). См. Пример ее
 * использования в методе main
 *
 * PS Предусмотреть деление на 0, в этом случае нужно возвращать число -999.
 *
 * Метод проверки: когда запустите метод main и посмотреть результаты в консоли.
 */
public class Task1 {

    /**
     * NOTE! Ко всем заданиям в этом классе.
     *
     * ТЫ не совсем понял условие про 0. Надо было его проверять только в том
     * случае, если у тебя в функции будет производиться деление. И то только
     * тогда когда это чисо является делителем.
     */
    public static double meterToInch(double meter) {
        // TODO метр -> дюйм
        double inch = meter * 39.37;
        return inch;

    }

    public static double inchToMeter(double inch) {
        // TODO дюйм -> метр
        if (inch == 0) {
            return -999;
        } else {
            double meter = inch / 39.37;
            return meter;
        }
    }

    public static double kilogramToGram(double kilogram) {
        // TODO килограмм -> грамм
        double gram = kilogram * 1000;
        return gram;
    }

    public static double gramToKilogram(double gram) {
        // TODO грамм -> килограмм
        if (gram == 0) {
            return -999;
        } else {
            double kilogram = gram / 1000;
            return kilogram;
        }
    }

    public static double literToCubicMeter(double liter) {
        // TODO литр -> кубический метр

        if (liter == 0) {
            return -999;
        } else {
            double cubicMeter = liter / 1000;
            return cubicMeter;
        }
    }

    public static double cubicMeterToLiter(double cubicMeter) {
        // TODO кубический метр -> литр
        double liter = cubicMeter * 1000;
        return liter;
    }

    public static double DollarBelrub(double Dollar) {   // курс НБРБ на 18.04.2020 года 
        double Belrub = Dollar * 2.44;
        return Belrub;
    }

    public static double KilometrMile(double kilometr) {
        if (kilometr == 0) {
            return -999;
        } else {
            double mile = kilometr / 1.60934;
            return mile;
        }
    }

    public static void main(String[] args) {

        System.out.println("5 метров = " + meterToInch(5) + " дюймов.");

        System.out.println("0 метров = " + meterToInch(0));

        System.out.println("10 дюймов = " + String.format("%.3f", inchToMeter(10)) + " м.");

        System.out.println("0 дюймов = " + inchToMeter(0));

        System.out.println("13 килограмм = " + kilogramToGram(13) + " г.");

        System.out.println("0 килограмм = " + kilogramToGram(0));

        System.out.println("991 грамм = " + gramToKilogram(991) + " кг.");

        System.out.println("0 грамм = " + gramToKilogram(0));

        System.out.println("88 литров = " + literToCubicMeter(88) + " м³.");

        System.out.println("0 литров = " + literToCubicMeter(0));

        System.out.println("69 куб.метр = " + cubicMeterToLiter(69) + " л.");

        System.out.println("0 куб.метров " + cubicMeterToLiter(0));

        System.out.println("5 километров = " + String.format("%.3f", KilometrMile(5)) + " миль.");

        System.out.println("0 миль = " + KilometrMile(0));

        System.out.println("25 Долларов = " + DollarBelrub(25) + " р.");

        System.out.println("0 Долларов = " + DollarBelrub(0));
    }
}
