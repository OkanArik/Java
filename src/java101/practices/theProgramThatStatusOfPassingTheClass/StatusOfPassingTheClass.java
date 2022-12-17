package java101.practices.theProgramThatStatusOfPassingTheClass;

import java.util.Scanner;

public class StatusOfPassingTheClass {
    public static void main(String[] args) {
        int mathematics, physic, turkish, chemistry, music;
        double averageOfNotes;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mathematics = input.nextInt();
        System.out.print("Fizik notunuzu giriniz :");
        physic = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz :");
        turkish = input.nextInt();
        System.out.print("Kimya notunuzu giriniz :");
        chemistry = input.nextInt();
        System.out.print("Müzik notunuzu giriniz :");
        music = input.nextInt();

        if (mathematics < 0 || mathematics > 100) {
            System.out.println("Geçersiz bir Matematik notu girdiniz hesaplamaya 0 olarak dahil edilecektir!");
            mathematics = 0;
        }
        if (physic < 0 || physic > 100) {
            System.out.println("Geçersiz bir Fizik notu girdiniz hesaplamaya 0 olarak dahil edilecektir!");
            physic = 0;
        }
        if (chemistry < 0 || chemistry > 100) {
            System.out.println("Geçerisiz bir Kimya notu girdiniz hesaplamaya 0 olarak dahil edilecektir!");
            chemistry = 0;
        }
        if (turkish < 0 || turkish > 100) {
            System.out.println("Geçersiz bir Türkçe notu girdiniz hesaplamaya 0 olarak dahil edilecektir!");
            turkish = 0;
        }
        if (music < 0 || music > 100) {
            System.out.println("Geçersiz bir Müzik notu girdiniz hesaplamaya 0 olarak dahil edilecektir!");
            music = 0;
        }

        averageOfNotes = (mathematics + physic + turkish + chemistry + music) / 5.0;

        if (averageOfNotes >= 55) {
            System.out.println("Sınıfı geçtiniz tebrikler :)");
            System.out.println("Ortalamanız : "+averageOfNotes);
        } else {
            System.out.println("Sınıfta kaldınız seneye görüşmek üzere !");
            System.out.println("Ortalamanız : "+averageOfNotes);
        }
    }
}
