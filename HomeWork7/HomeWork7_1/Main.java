package HomeWork7_1;

public class Main {

    public static void main(String[] args) {
        number(10);
    }

    static int number(int n) {
        /** NOTE! Что ты тут намудрил с инкрементами и декрементами переменной a.
         * Тут можно сделать проще. */
//        a--;

        /** NOTE! Что-то не круто тут с этими двумя if конструкциями.
         * Тут можно написать проще.*/
//        if (a == 0) {
//            System.out.println(a);
//        }
//        if (a != 0) {
//            number(a);
//        }
//        a++;
//        System.out.println(a);

       //проще уже некуда)
        System.out.println(n);
        if(n==1){
            return 1;
        }

        return (number(n-1));
    }
}
