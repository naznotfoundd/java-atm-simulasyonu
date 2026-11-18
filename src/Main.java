import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bakiye = 10000;
        double toplamYatirilan = 0;
        double toplamCekilen = 0;

        int islemSayisi = 0;
        int secim;

        boolean devam = true;

        while (devam) {

            System.out.println("ATM Sistemine Hos Geldiniz");
            System.out.println("1. Bakiye Goruntuleme");
            System.out.println("2. Para Yatirma");
            System.out.println("3. Para Cekme");
            System.out.println("4. Cikis");
            System.out.print("Seciminizi yapiniz: ");

            secim = input.nextInt();

            switch (secim) {

                case 1:
                    System.out.println("Mevcut bakiyeniz: " + bakiye + " TL");
                    islemSayisi++;
                    break;

                case 2:
                    System.out.print("Yatirmak istediginiz tutari giriniz: ");
                    double yatirilan = input.nextDouble();

                    if (yatirilan > 0) {
                        bakiye += yatirilan;
                        toplamYatirilan += yatirilan;
                        islemSayisi++;

                        System.out.println("Para yatirma islemi basarili.");
                        System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                    } else {
                        System.out.println("Hatali tutar! Pozitif bir deger giriniz.");
                    }
                    break;

                case 3:
                    System.out.print("Cekmek istediginiz tutari giriniz: ");
                    double cekilen = input.nextDouble();

                    if (cekilen <= 0) {
                        System.out.println("Hatali tutar! Pozitif bir deger giriniz.");
                    } else if (cekilen > bakiye) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        bakiye -= cekilen;
                        toplamCekilen += cekilen;
                        islemSayisi++;

                        System.out.println("Para cekme islemi basarili.");
                        System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                    }
                    break;

                case 4:
                    devam = false;
                    System.out.println("Programdan cikiliyor.");
                    break;

                default:
                    System.out.println("Gecersiz secim! Tekrar deneyiniz.");
            }

            System.out.println();
        }

        System.out.println("Hesap Ozeti");
        System.out.println("Son bakiye: " + bakiye + " TL");
        System.out.println("Toplam islem sayisi: " + islemSayisi);
        System.out.println("Toplam yatirilan tutar: " + toplamYatirilan + " TL");
        System.out.println("Toplam cekilen tutar: " + toplamCekilen + " TL");

        input.close();
    }
}

        // TODO: 1. Başlangıç değerlerini tanımlayın (bakiye, işlem sayısı, toplam yatırılan, toplam çekilen)

        // TODO: 2. Çıkış seçilene kadar tekrar eden bir döngü kurun

        // TODO: 3. Menüyü gösterin ve kullanıcının seçimini alın

        // TODO: 4. Seçime göre bakiye / yatırma / çekme / çıkış işlemlerini yapın
        //          (yatırmada tutar > 0, çekmede bakiye kontrolü, geçersiz seçimde hata mesajı)

        // TODO: 5. Çıkışta son bakiyeyi, işlem sayısını ve toplam tutarları gösterin

        scanner.close();
    }
}
