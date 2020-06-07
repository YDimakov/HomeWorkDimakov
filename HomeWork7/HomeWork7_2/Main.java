package HomeWork7_2;

public class Main {

    public static void main(String[] args) {
        number(654321);
    }

    static void number(int num) {
       if(num/10==0){
           System.out.print(num+ " ");
       }else{
           number(num%10);
           number(num/10);
       }

    }
}
