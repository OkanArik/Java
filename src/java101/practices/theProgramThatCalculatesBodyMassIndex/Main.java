package java101.practices.theProgramThatCalculatesBodyMassIndex;

import java.util.Scanner;

/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül : Kilo(kg) / ( Boy(m) * Boy(m) )
 */
public class Main {
    public static void main(String[] args) {
        double height , weight , bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height : ");
        height = input.nextDouble();

        System.out.print("Enter your weight : ");
        weight = input.nextDouble();

        bodyMassIndex = weight / (height * height);

        System.out.println("Your body mass ındex : "+bodyMassIndex);
    }
}
