package HomeWork7_5;

public class Link {
    private LinkList head;
    private LinkList temp;

    public void add(int num) { // добавление элементов
        temp = new LinkList(num);
        temp.next = head;
        head = temp;
    }

    public void print() { // вывод на консоль список
        LinkList linkList = head;
        while (linkList != null) {
            System.out.println(linkList.num + " ");
            linkList = linkList.next;
        }
    }

    public void remove() {//удаление последнего элемента
        head = head.next;
    }

    public int getIndex(int key) { //получение значения по элементу
        LinkList linkList = head;
        int num = 0;
        while (linkList != null) {
            if (linkList.num == key) {
                return num;
            }
            linkList = linkList.next;
            num++;
        }
        return -1;
    }
}
