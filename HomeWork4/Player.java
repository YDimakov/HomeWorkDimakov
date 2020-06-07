package HomeWork4;

public class Player {   // наши игроки

    /**
     * NOTE! Для всего класса! Именование полей классов и методов должно быть в
     * camelCase. При чем если это метод или поле класса, то имя тогда должно
     * начинаться с прописной буквы исправил!
     */
    private final int[] arrayNumber;
    private final int nomer;
    private boolean win;   

    public boolean win() {
        return win;
    }

    public void win(boolean win) {
        this.win = win;
    }

    public Player(int nomer, int[] array) {
        this.arrayNumber = array;
        this.nomer = nomer;
    }

    public int[] getArrayNumber() {
        return arrayNumber;
    }

    public int getNomer() {
        return nomer;
    }
}
