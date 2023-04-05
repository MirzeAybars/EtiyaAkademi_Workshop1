public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");
        //while
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("While döngüsü bitti");

        //DO-While
        int j = 0;
        do {

            System.out.println(j);
            j+=2;
        }
        while(j<10);
        System.out.println("Do-While döngüsü bitti");
    }


}