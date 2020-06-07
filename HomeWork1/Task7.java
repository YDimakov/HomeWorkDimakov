/**
 * Задание № 7
 *
 * 1) Написать функцию определения количества дней месяца месяца по его номеру.
 * То есть, в функцию будет подано число. Если это число находится
 * в диапазоне 1 - 12, то нам нужно соответствующее количество дне для месяца и
 * его название.
 * Если же было введено число, которое не попадает в заданный диапазон,
 * то нужно вывести сообщение с ошибкой ("Число не в диапазоне").
 *
 * Решение должно быть представлено в двух вариантах в отдельных функциях:
 * - с использованием if-else.
 * Подсказка: можно несколько раз использовать логическое "ИЛИ"(||)
 * - с использованием switch-case
 *
 * 2) Произвести вызов функций в main
 *
 *  Пример вызова:
 *  printMonthWithIfElse(12)
 *  printMonthWithIfElse(44)
 */

public class Task7 {

    public static void printDaysInMonthWithIfElse(int monthNumber1) {
        /**
         * NOTE! Тут можно упростить код используя логические операторы ИЛИ (||)
         */
      
        
        if(monthNumber1==1||monthNumber1==3||monthNumber1==5||monthNumber1==7||monthNumber1==8||monthNumber1==10||monthNumber1==12){
                    System.out.println("31 день");
                    }
        else if (monthNumber1==2){
                    System.out.println("В Феврале -28/29 дней");
                    }
        else if(monthNumber1==4||monthNumber1==6||monthNumber1==9||monthNumber1==11){
                    System.out.println("30 дней");
                    }
        else{System.out.println("Такого месяца не существует");   
                    }  
    }
     

    public static void printDaysInMonthWithSwithCase(int monthNumber) {
        /**
         * NOTE! Тут можно упростить код, если скомпановать месяцы рядом
         * и писать case без break и ставить его только в конце группы. См. пример
         *
         * switch (monthNumber){
         *     case 1:
         *     case 3:
         *     case 5:
         *     case 7:
         *     case 8:
         *     case 10:
         *     case 12:
         *      System.out.println(" В Январе 31 день");
         *      break;
         *     case 2:
         *      System.out.println("В Феврале -28/29 дней");
         *      break;
         *
         *      .....
         *
         *
         * }
         *
         * B т.д.               Почему-то не смог сгрупировать!
         *                         Но все работает)
         */
        switch (monthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               System.out.println("31 день");
             break;
            case 2:
               System.out.println("В Феврале -28/29 дней");
             break;
            case 4:
            case 6:  
            case 9:
            case 11:
               System.out.println("30 день");
              break;
            default: System.out.println("Такого месяца не существует");

        }
    }
    

    public static void main(String[] args) {
        // вызвать функцию здесь
        printDaysInMonthWithSwithCase(15);
        printDaysInMonthWithIfElse(16);
        
    }
}
