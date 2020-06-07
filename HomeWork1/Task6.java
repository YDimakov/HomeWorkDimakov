/**
 * Задание № 6
 *
 * 1) Написать функцию определения месяца по его номеру. То есть, в функцию
 * будет подано число. Если это число находится в диапазоне 1 - 12, то нам нужно
 * вывести соответствующее имя месяца. Если же было введено число, которое не
 * попадает в заданный диапазон, то нужно вывести сообщение с ошибкой ("Число не
 * в диапазоне").
 *
 * Решение должно быть представлено в двух вариантах в отдельных функциях: - с
 * использованием if-else - с использованием switch-case
 *
 * 2) Произвести вызов функций в main
 *
 * Пример вызова: printMonthWithIfElse(1)
 */
public class Task6 {

    public static void printMonthWithIfElse(int monthNumber1) {
        /**
         * NOTE! Первый if-else по сути избыточный. Можно
         * прсто написать else после if (monthNumber1==12)
         * и будет работать также, а код будет более понятен
         */       
        if(monthNumber1==1){
                    System.out.println("Январь");
                    }
        else if (monthNumber1==2){
                    System.out.println("Февраль");
                    }
        else if (monthNumber1==3){
                    System.out.println("Март");
                    }
        else if (monthNumber1==4){
                    System.out.println("Апрель");
                    }
        else if (monthNumber1==5){
                    System.out.println("Май");
                    }
        else if (monthNumber1==6){
                    System.out.println("Июнь");
                    }
        else if (monthNumber1==7){
                    System.out.println("Июль");
                    }
        else if (monthNumber1==8){
                    System.out.println("Август");
                    }
        else if (monthNumber1==9){
                    System.out.println("Сентябрь");
                    }
        else if (monthNumber1==10){
                    System.out.println("Октябрь");
                    }
        else if (monthNumber1==11){
                    System.out.println("Ноябрь");
                    }
        else if (monthNumber1==12){
                    System.out.println("Декабрь");                 
        }else {
            System.out.println("Такого месяца не существует!");
        }
    }
    

    public static void printMonthWithSwithCase(int monthNumber) {
        // TODO решение через switch-case
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default: System.out.println("Такого месяца не существует");

        }
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        printMonthWithIfElse(5);
        printMonthWithSwithCase(12);
    }
}
