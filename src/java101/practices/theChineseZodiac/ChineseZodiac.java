
/*
Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve
sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir
hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
 */

package java101.practices.theChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int yearOfBirthday ;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        yearOfBirthday = input.nextInt();
        System.out.println("Çin zodyağı burcunuz : "+zodiacSign(yearOfBirthday));
    }

    private static String zodiacSign(int yearOfBirth) {
        String result = switch (yearOfBirth%12) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan;";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "";
        };
        return result;
    }
}
