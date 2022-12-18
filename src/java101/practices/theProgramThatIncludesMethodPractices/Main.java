package java101.practices.theProgramThatIncludesMethodPractices;

import java.util.Scanner;

public class Main {

    //Polindrom
    private static boolean isPolindrom(String word) {
        System.out.println(reverseOfString(word).replace(" ", ""));
        System.out.println(word.toLowerCase().replace(" ", ""));
        return word.toLowerCase().replace(" ", "").equals(reverseOfString(word).replace(" ", ""));
    }


    // String ters çevirme
    private static String reverseOfString(String word) {
        String reverseOfWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseOfWord += word.substring(i, i + 1);
        }
        return reverseOfWord.toLowerCase();
    }


    //Asal sayı mı?
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        else if (number == 2) return true;
        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Fibonacci serisinde n. sayı
    private static long nThNumberAtFibanocciSeries(long number) {
        if (number == 1) return 0;
        if (number == 2) return 1;
        return nThNumberAtFibanocciSeries(number - 1) + nThNumberAtFibanocciSeries(number - 1);
    }


    //Üs alma
    private static double power(int base, int exponantial) throws Exception {
        if (exponantial == 0 || base == 1) {
            if (base == 0) throw new Exception("Sonucu belirlenmemiş matematiksel ifade!");
            return 1;
        }
        if (exponantial == 1) return base;
        return exponantial < 0 ? 1.0 / (power(base, exponantial - 1) * base) : power(base, exponantial - 1) * base;
    }

    /*
     Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana
     son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son
     değerini ekrana yazdırın.
     */
    private static int numberControl, control = 1;

    private static String methodByPatterDecrement(int number) {
        if (control == 1) {
            numberControl = number;
            control = 0;
        }
        if (number > 0)
            return number + " " + methodByPatterDecrement(number - 5);
        return methodByPatternIncrement(number);
    }

    private static String methodByPatternIncrement(int number) {
        if (number == numberControl) {
            control = 1;
            return number + "";
        }
        return number + " " + methodByPatternIncrement(number + 5);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*        while(true){
            String word = input.nextLine();
            if(isPolindrom(word))
                System.out.println("Polindrom");
            else
                System.out.println("Not Polindrom");
        }*/
/*        int testCounter = 0 ;
        do{
            //int number = input.nextInt();

            System.out.print((isPrime(testCounter)? testCounter+"  " : ""));
            testCounter++;
        }while(testCounter<=100);*/


/*      int testCounter = 1;
        do {
            System.out.print(nThNumberAtFibanocciSeries(testCounter) + " ");
            testCounter++;
        } while (testCounter <= 40);*/


/*        int testCounter = 1;
        do {
            try {
                System.out.print(power(testCounter, testCounter) + "   ");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println(testCounter + "^" + testCounter);
                testCounter++;
            }
        } while (testCounter <= 10);*/

/*        System.out.println(methodByPatterDecrement(203));
        System.out.println(methodByPatterDecrement(16));
        System.out.println(methodByPatterDecrement(12));*/

    }
}
