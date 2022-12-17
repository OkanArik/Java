package java101.practices.theProgramThatCalculatesKDVAmount;

import java.util.Scanner;

public class KdvAmount {
    /*
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den
    büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */
    public static void main(String[] args) {
        double kdvsizTutar , kdvliTutar , kdvOran , kdvTutari ;

        Scanner input = new Scanner(System.in);

        System.out.print("KDV'siz Tutarını Giriniz : ");
        kdvsizTutar = input.nextDouble();
        kdvsizTutar = kdvsizTutar < 0 ? 0 : kdvsizTutar;
        kdvOran = kdvsizTutar<1000 ? 0.18 : 0.8 ;
        kdvTutari = kdvsizTutar * kdvOran ;
        kdvliTutar = kdvsizTutar + kdvTutari ;

        System.out.println("KDV'siz Tutar : "+kdvsizTutar);
        System.out.println("KDV oranı     : "+kdvOran);
        System.out.println("KDV Tutarı    : "+kdvTutari);
        System.out.println("KDV'li Tutar  : "+kdvliTutar);
    }
}
