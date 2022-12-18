package java101.practices.advancedCalculator;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    private static int selection() {
        System.out.println("-----Menü-----" +
                "\n1- Toplama İşlemi" +
                "\n2- Çıkarma İşlemi" +
                "\n3- Çarpma İşlemi" +
                "\n4- Bölme İşlemi" +
                "\n5- Üslü Sayı Hesaplama" +
                "\n6- Mod Alma" +
                "\n7- Dikdörtgen Alan ve Çevre Hesabı" +
                "\n0 Çıkış Yap");
        System.out.print("Seçiminizi giriniz : ");
        return scan.nextInt();
    }

    private static void sum() {
        System.out.println("Toplama işlemine sokacağınız iki sayıyı giriniz.");
        System.out.print("Birinci sayı : ");
        double numberOne = scan.nextDouble();
        System.out.print("İkinci sayıyı giriniz :");
        double numberTwo = scan.nextDouble();
        System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
    }

    private static void subtraction() {
        System.out.println("Çıkarma işlemine sokacağınız iki sayı girin, birinci sayıdan ikinci sayıyı çıkaralım.");
        System.out.print("Birinci sayı : ");
        double numberOne = scan.nextDouble();
        System.out.print("İkinci sayı : ");
        double numberTwo = scan.nextDouble();
        System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
    }

    private static void multiplication() {
        System.out.println("Çarpma işlemine sokacağınız iki sayıyı giriniz.");
        System.out.print("Birinci sayı : ");
        double numberOne = scan.nextDouble();
        System.out.print("İkinci sayı : ");
        double numberTwo = scan.nextDouble();
        System.out.println(numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
    }

    private static void divide() {
        System.out.println("Bölme işlemine sokacağınız iki sayı girin, birinci sayıyı ikinci sayıya bölelim.");
        System.out.print("Birinci sayı : ");
        double numberOne = scan.nextDouble();
        System.out.print("İkinci sayı : ");
        double numberTwo = scan.nextDouble();
        System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
    }

    private static void pow() {
        System.out.println("Üs alma işlemine sokacağınız iki sayıyı giriniz.");
        System.out.print("Taban : ");
        double base = scan.nextDouble();
        System.out.print("Üs : ");
        double powerNumber = scan.nextDouble();
        try {
            System.out.println(base + " ^ " + powerNumber + " = " + power(base, powerNumber));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static double power(double base, double power) throws Exception {
        if (base == 0 || power == 0) {
            if (base == 0 && power == 0)
                throw new Exception("Matematiksel karşılığı olmayan ifade!");
            else if (base == 0)
                return 0;
            else
                return 1;

        }
        return power(base, power - 1) * base;
    }

    private static void mode() {
        System.out.println("Mod alma işlemine sokcağınız iki sayıyı giriniz.");
        System.out.print("Birinci sayı : ");
        double numberOne = scan.nextDouble();
        System.out.print("İkinci sayı : ");
        double numberTwo = scan.nextDouble();
        System.out.println(numberOne + " % " + numberTwo + " = " + (numberOne % numberTwo));
    }

    private static void rectangle() {
        System.out.println("Alanını ve çevresini bulmak istediğiniz dikdörtgenin kenar uzunluklarını giriniz.");
        System.out.print("Birinci kenar : ");
        double firstEdge = scan.nextDouble();
        System.out.print("İkinci kenar : ");
        double secondEdge = scan.nextDouble();
        System.out.println("Dikdötgenin çevresi : " + ((firstEdge + secondEdge) * 2));
        System.out.println("Dikdörtgenin alanı  : " + (firstEdge * secondEdge));
    }

    public static void main(String[] args) {
        int selection;

        do {
            selection = selection();
            switch (selection) {
                case 1:
                    sum();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    mode();
                    break;
                case 7:
                    rectangle();
                    break;
                default:
                    System.out.println(selection == 0 ? "Güle Güle :)" : "Geçersiz bir seçim yaptınız! Tekrar Deneyiniz...");
            }

        } while (selection != 0);


    }
}
