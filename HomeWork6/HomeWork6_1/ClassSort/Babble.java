package HomeWork6_1.ClassSort;

import HomeWork6_1.InterfaceSort.Sortable;

public class Babble implements Sortable {

    /**
     * NOTE! Вот что такое "а"? Мне вот не понятно. =) Надо дать нормальное
     * название.
     * -исправил!
     */
    
    @Override
    public void numbersSort(int[] userNumbers, boolean variable) {
        /**
         * NOTE! Булевы значения можно не сравнить с false, а просто дописать
         * нужный оператор. if (!a)
         * 
         * -исправил!
         *
         * А вообще этот метод можно упростить. Тут слишком ного копипаста. У
         * тебя 95% кода в if и else идентичная.
         * 
         * -испарвил!
         *
         */
        for (int i = 0; i < userNumbers.length; i++) {
            for (int g = i + 1; g < userNumbers.length; g++) {
                if (!variable) {
                    if (userNumbers[i] < userNumbers[g]) {
                        int temp = userNumbers[i];
                        userNumbers[i] = userNumbers[g];
                        userNumbers[g] = temp;
                    }
                } else {
                    if (userNumbers[i] > userNumbers[g]) {
                        int temp = userNumbers[i];
                        userNumbers[i] = userNumbers[g];
                        userNumbers[g] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print(userNumbers[i] + " ");
        }
    }
}
