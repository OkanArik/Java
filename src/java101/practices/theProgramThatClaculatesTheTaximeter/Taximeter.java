package java101.practices.theProgramThatClaculatesTheTaximeter;

import java.util.Scanner;

/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
public class Taximeter {
    public static void main(String[] args) {
        double km , startPrice = 10 , total , perKm = 2.2 , lowerLimitPrice = 20 ;
        String result ;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextDouble();
        total = startPrice + (km * perKm) ;
        result = total <= 20 ?
                "Toplam tutar \"Bindi indi tutarıdır.\" : "+lowerLimitPrice+" TL" :
                "Toplam tutar : "+total+" TL" ;
        System.out.println(result);
    }
}
