package java101.practices.methodByPattern;

public class Main {
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
        System.out.println(methodByPatterDecrement(203));
        System.out.println(methodByPatterDecrement(16)); // 16 11 6 1 -4 1 6 11 16
        System.out.println(methodByPatterDecrement(33)); // 33 28 23 18 13 8 3 -2 3 8 13 18 23 28 33
    }
}
