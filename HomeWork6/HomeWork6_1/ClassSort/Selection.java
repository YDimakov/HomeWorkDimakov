package HomeWork6_1.ClassSort;

import HomeWork6_1.InterfaceSort.Sortable;

public class Selection implements Sortable {

    /**
     * NOTE! Вот что такое "а"? Мне вот не понятно. =) Надо дать нормальное
     * название.
     *
     * -исправил!
     */
    @Override
    public void numbersSort(int[] userNumbers, boolean variable) {
        /**
         * NOTE! Булевы значения можно не сравнить с false, а просто дописать
         * нужный оператор. if (!a)
         *
         * -испаравил!
         *
         * А вообще этот метод можно упростить. Тут слишком ного копипаста. У
         * тебя 95% кода в if и else идентичная.
         *
         * -испарвил!
         */

        for (int i = 0; i < userNumbers.length; i++) {
            int jc = userNumbers[i];
            int num = i;
            for (int j = i + 1; j < userNumbers.length; j++) {
                if (!variable) {
                    if (userNumbers[j] > jc) {
                        jc = userNumbers[j];
                        num = j;
                    }
                } else {
                    if (userNumbers[j] < jc) {
                        jc = userNumbers[j];
                        num = j;
                    }
                }
                int temp = userNumbers[i];
                userNumbers[i] = jc;
                userNumbers[num] = temp;
            }
        }
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print(userNumbers[i] + " ");
        }
    }
}
