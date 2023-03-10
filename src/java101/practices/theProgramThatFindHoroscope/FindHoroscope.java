package java101.practices.theProgramThatFindHoroscope;

import java.util.Scanner;

/*
        Koç Burcu          : 21 Mart    - 20 Nisan
        Boğa Burcu         : 21 Nisan   - 21 Mayıs
        İkizler Burcu      : 22 Mayıs   - 22 Haziran
        Yengeç Burcu       : 23 Haziran - 22 Temmuz
        Aslan Burcu        : 23 Temmuz  - 22 Ağustos
        Başak Burcu        : 23 Ağustos - 22 Eylül
        Terazi Burcu       : 23 Eylül   - 22 Ekim
        Akrep Burcu        : 23 Ekim    - 21 Kasım
        Yay Burcu          : 22 Kasım   - 21 Aralık
        Oğlak Burcu        : 22 Aralık  - 21 Ocak
        Kova Burcu         : 22 Ocak    - 19 Şubat
        Balık Burcu        : 20 Şubat   - 20 Mart
 */
public class FindHoroscope {
    public static void main(String[] args) {
        int day , month;

        Scanner input = new Scanner((System.in));

        System.out.println("Burç bulan program!");

        System.out.print("Yılın kaçıncı ayında doğdunuz : ");
        month = input.nextInt();

        System.out.print("Ayın kaçıncı gününde doğdunuz : ");
        day = input.nextInt();

        if(month>0 &&month<13) {
            if (month == 1) {
                if (day > 0 && day <= 31) {
                    if (day <= 22)
                        System.out.println("Oğlak Burcu");
                    else
                        System.out.println("Kova Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 2) {
                if (day > 0 && day <= 28) {
                    if (day <= 19)
                        System.out.println("Kova Burcu");
                    else
                        System.out.println("Balık Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 3) {
                if (day > 0 && day <= 30) {
                    if (day <= 20)
                        System.out.println("Balık Burcu");
                    else
                        System.out.println("Koç Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 4) {
                if (day > 0 && day <= 30) {
                    if (day <= 20)
                        System.out.println("Koç Burcu");
                    else
                        System.out.println("Boğa Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 5) {
                if (day > 0 && day <= 30) {
                    if (day <= 21)
                        System.out.println("Boğa Burcu");
                    else
                        System.out.println("İkizler Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 6) {
                if (day > 0 && day <= 30) {
                    if (day <= 22)
                        System.out.println("İkizler Burcu");
                    else
                        System.out.println("Yengeç Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 7) {
                if (day > 0 && day <= 30) {
                    if (day <= 22)
                        System.out.println("Yengeç Burcu");
                    else
                        System.out.println("Aslan Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 8) {
                if (day > 0 && day <= 30) {
                    if (day <= 22)
                        System.out.println("Aslan Burcu");
                    else
                        System.out.println("Başak Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 9) {
                if (day > 0 && day <= 30) {
                    if (day <= 22)
                        System.out.println("Başak Burcu");
                    else
                        System.out.println("Terazi Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 10) {
                if (day > 0 && day <= 30) {
                    if (day <= 22)
                        System.out.println("Terazi Burcu");
                    else
                        System.out.println("Akrep Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 11) {
                if (day > 0 && day <= 30) {
                    if (day <= 22)
                        System.out.println("Akrep Burcu");
                    else
                        System.out.println("Yay Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            } else if (month == 12) {
                if (day > 0 && day <= 30) {
                    if (day <= 22)
                        System.out.println("Yay Burcu");
                    else
                        System.out.println("Oğlak Burcu");
                } else
                    System.out.println("Geçersiz bir tarih girdiniz!");
            }
        }else
            System.out.println("Geçersiz tarih girdiniz!");
    }
}
