public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 6;
        boolean varmi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            mesajVer("Sayi mevcuttur" + aranacak);
        } else {
            System.out.println(aranacak + " Mevcut Degildir");
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}