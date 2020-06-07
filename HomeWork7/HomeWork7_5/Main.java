package HomeWork7_5;

public class Main {

    public static void main(String[] args) {

        Link link = new Link();
        link.add(10);
        link.add(20);
        link.add(555);
        link.print();
        System.out.println(" ");
        link.remove();
        link.print();
        System.out.println(" ");
        System.out.println("Индекс вашего элемента: "+link.getIndex(20));

    }
}
