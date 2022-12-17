package java101.practices.theProgramThatIncludesLoopPractices;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*        System.out.print("Bir sayı giriniz ve sıfırdan girdiğiniz sayıya kadar olan çift sayıları yazdıralım : ");
        int number = input.nextInt();
        int[] evenNumbers = methodToFindEvenNumbersUpToTheEnteredNumber(number);
        System.out.println(Arrays.toString(evenNumbers));*/

/*        System.out.print("Bir sayı giriniz ve sıfırdan girdiğiniz sayıya kadar olan 3'e ve 4' tam bölünen sayıları yazdıralım : ");
        int numberOne = input.nextInt();
        int numbersDivsibleByThreeAndFour[][] = methodToFindNumbersDivisibleByThreeAndFourFromToZeroToNumberEntered(numberOne);
        System.out.println("3'e tam bölünen sayılar "+Arrays.toString(numbersDivsibleByThreeAndFour[0]));
        System.out.println("4'e tam bölünen sayılar "+Arrays.toString(numbersDivsibleByThreeAndFour[1]));*/

//        methodThatAddsOddNumbersFromTheEnteredNumbers();

//        methodThatFindsTheSumOfEvenNumbersFromTheEnteredNumbers();

/*        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.println("Girdiğiniz sayıya kadar olan sayılarda hangi sayıların kuvvetini bulmak istiyorsunuz ? ");
        System.out.print("Kaç farklı sayı gireceksiniz : ");
        int countOfElements = input.nextInt();
        int[] numbers = new int[countOfElements];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + " . sayıyı giriniz : ");
            numbers[i] = input.nextInt();
        }
        methodThatFindsThePowersOfGivenNumbersUpToTheEnteredNumber(number, numbers);*/

/*        System.out.print("Faktriyelini almak istediğiniz pozitif tam sayıyı giriniz : ");
        long number = input.nextLong();
        System.out.println(factorial(number));
        System.out.println(factorialRecursiveMethod(number));*/

/*        do {
            System.out.println("n'in r'li kombinasyonunu bulmak için sırası ile n ve r 'yi giriniz : ");
            System.out.print("n : ");
            int n = input.nextInt();
            System.out.print("r : ");
            int r = input.nextInt();
            System.out.println("C(n,r) : " + combination(n, r));
        } while (true);*/

/*        do {
            System.out.println("n'in r üssünü bulmak için sırası ile n ve r 'yi giriniz : ");
            System.out.print("n : ");
            int n = input.nextInt();
            System.out.print("r : ");
            int r = input.nextInt();
            System.out.println("n^r : " + exponentialMethod(n, r));
        } while (true);*/

/*        while (true) {
            System.out.println("Bir sayı giriniz armstrong sayı mı bakalım.");
            System.out.print("Sayı : ");
            long number = input.nextLong();
            if (isArmstrongNumber(number))
                System.out.println(number + " bir armstrong sayıdır.");
            else
                System.out.println(number + " bir armstrong sayı değildir.");
        }*/

/*        int counter = 0;
            while (true) {
        //System.out.println("Bir sayı giriniz basamak değerlerinin toplamını bulalım.");
        //System.out.print("Sayı : ");
        //int number = input.nextInt();
        //System.out.println("Basamak değerleri toplamı = "+methodToFindTheSumOfPlaceValues(number));
            System.out.println(counter);
            System.out.println("Basamak değerleri toplamı = "+methodToFindTheSumOfPlaceValues(counter));
            if (isArmstrongNumber(counter))
                System.out.println(counter + " bir armstrong sayıdır.");
            else
                System.out.println(counter + " bir armstrong sayı değildir.");
            counter++;
            if(counter==1635)
                break ;
        }*/


/*        while (true) {
            int n = 0;
            System.out.println("n değerini giriniz ve n'e kadar olan harmonik seriyi hesapkayalım. ");
            System.out.print("n = ");
            n = input.nextInt();
            System.out.println(n + " sayısının harmonik seri sonucu : " + harmonicSeries(n));
            System.out.println(n + " sayısının harmonik seri sonucu : " + recursiveHarmonicSeries(n));
        }*/
/*        do {
            System.out.println("Konsol'a çizdirmek istediğiniz üçgenin yüksekliğini giriniz.");
            System.out.println("Konsol'a çizdirmek istediğiniz yıldızın yüksekliğini giriniz.");
            System.out.print("Yükseklik : ");
            int height = input.nextInt();

            paintTriangleWithStars(height);
            paintDiamondWithStars(height);
        } while (true);*/


//        atmProgram();

/*        do {
            System.out.println("İki sayı gir ebobunu ve ekokunu hesaplayalım. ");
            System.out.print("Sayi bir : ");
            int numberOne = input.nextInt();
            System.out.print("Sayi iki : ");
            int numberTwo = input.nextInt();
            System.out.println(numberOne + " ebob " + numberTwo + " = " + ebob(numberOne, numberTwo));
            System.out.println(numberOne + " ekok " + numberTwo + " = " + ekok(numberOne, numberTwo));
        } while (true);*/


/*        System.out.println("Gireceğin sayıarden max ve min olanları bulalım.");
        System.out.print("Kaç adet sayı gireceksin : ");
        int countOfElements = input.nextInt();
        int[] numbers = new int[countOfElements];
        for (int i = 0; i < countOfElements; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz : ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Max = "+maxNumber(numbers));
        System.out.println("Min = "+minNumber(numbers));*/


/*        do {
            System.out.println("Sayı girin mükemmel sayı mı bakalım.");
            System.out.print("Sayı  : ");
            int number = input.nextInt();
            System.out.println(number + " sayısı " + (isPerfectNumber(number) ? " mükemmel bir sayısıdır." : " mükemmel bir sayı değildir."));
        } while (true);*/

/*        int testCounter = 1;
        do {
            methodOfDrawingAnInvertedTriangleWithStars(testCounter);
            testCounter++;
        } while (testCounter < 21);*/

/*        while (true) {
            System.out.println("Bir sayı giriniz ve girdiğiniz sayıya kadar olan asal sayıları konsola yazdıralım.");
            System.out.print("Sayı  : ");
            int number = input.nextInt();
            for (var num : primeNumbersList(number)) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }*/

/*        while (true) {
            System.out.print("Kaç elamanlı fibanocci serisini istiyorsunuz : ");
            int countOfElements = input.nextInt();
            System.out.print(countOfElements+" elamalı fibonacci serisi : ");
            for (var element : fibonacciSeries(countOfElements))
                System.out.print("\t" +element);
            System.out.println();
        }*/

    }

    private static int[] methodToFindEvenNumbersUpToTheEnteredNumber(int number) {
        int[] evenNumbers = new int[number / 2 + 1];
        for (int i = 0; i <= number / 2; i++)
            evenNumbers[i] = i * 2;

        return evenNumbers;
    }

    private static int[][] methodToFindNumbersDivisibleByThreeAndFourFromToZeroToNumberEntered(int number) {
        int[][] numbersDivisibleByThreeAndFour = new int[2][];
        numbersDivisibleByThreeAndFour[0] = new int[number / 3];
        numbersDivisibleByThreeAndFour[1] = new int[number / 4];
        int counterZero = 0, counterOne = 0;
        for (int i = 2; i <= number; i++) {
            if (i % 3 == 0)
                numbersDivisibleByThreeAndFour[0][counterZero++] = i;
            if (i % 4 == 0)
                numbersDivisibleByThreeAndFour[1][counterOne++] = i;
        }
        return numbersDivisibleByThreeAndFour;
    }

    private static void methodThatAddsOddNumbersFromTheEnteredNumbers() {
        Scanner input = new Scanner(System.in);
        long number, total = 0;

        System.out.println("Girdiğiniz sayılardan tek olanları toplayacağız ve sonucu ekrana yazdıracağız." +
                "\n\tSayı girişini durdurmak için negatif bir sayı giriniz!");

        do {
            System.out.print("Sayı giriniz : ");
            number = input.nextLong();
            if (number % 2 == 1)
                total += number;
        } while (number >= 0);

        System.out.println("Girilen tek sayıların toplamı = " + total);
    }

    private static void methodThatFindsTheSumOfEvenNumbersFromTheEnteredNumbers() {
        int totalOfEvenNumbers = 0, number;
        Scanner input = new Scanner(System.in);
        System.out.println("Girdiğiniz sayılardan çift olanları toplayacağız ve sonucu ekrana yazdıracağız." +
                "\n\tSayı girişini durdurmak için negatif bir sayı giriniz!");

        do {
            System.out.print("Sayı giriniz : ");
            number = input.nextInt();
            if (number % 2 == 0)
                totalOfEvenNumbers += number;
        } while (number >= 0);

        System.out.println("Girilen çift sayıların toplamı = " + totalOfEvenNumbers);
    }

    private static void methodThatFindsThePowersOfGivenNumbersUpToTheEnteredNumber(int number, int[] numbers) {
        System.out.println("Girilen sayı = " + number);
        for (int i = 0; i < numbers.length; i++) {
            if (number < numbers[i] || numbers[i] <= 1) {
                System.out.println(number + " sayısına kadar " + numbers[i] + " sayısının kuvveti işlemi geçersizdir. ");
                continue;
            }
            System.out.print(number + " sayısına kadar " + numbers[i] + " sayısının kuvvetleri = ");
            int counter = 0, result = 1;
            do {
                System.out.print("\t" + result);
            } while (number >= (result = (int) Math.pow(numbers[i], ++counter)));
            System.out.println();
        }
    }

    private static String factorial(long number) {
        long result = 1;
        for (int i = 2; i <= number; i++)
            result *= i;
        return number < 0 ? "Geçersiz veri girdiniz! " : result + "";
    }

    private static long factorialRecursiveMethod(long number) {
        if (number < 0)
            return 0;
        else if (number <= 1)
            return 1;
        return factorialRecursiveMethod(number - 1) * number;
    }

    private static String combination(int n, int r) {
        int difference = n - r;
        long nFactorialDividedrFactorial = 1, result;
        if (r > n)
            return "Geçersiz veri girişi yaptınız! ";
        for (int i = (r + 1); i <= n; i++) {
            nFactorialDividedrFactorial *= i;
        }
        result = nFactorialDividedrFactorial / factorialRecursiveMethod(n - r);
        return result + "";
    }

    /*private static long factorialMethod(long number) {
        long total = 1;
        if (number < 0)
            return -1;
        for (int i = 2; i <= number; i++) {
            total *= i;
        }
        return total ;
    }*/

    private static String exponentialMethod(int n, int r) {
        if (n == 0 && r == 0)
            return "Sonucunun ne olduğu belirlenmemiş matematiksel bir ifadedir.";
        else if (n == 0)
            return "0";
        else if (r == 0)
            return "1";
        int number = 1;
        int powNumber = Math.abs(r);
        for (int i = 1; i <= powNumber; i++)
            number *= n;
        if (r > 0)
            return number + "";
        else
            return (1.0 / number) + "";
    }

    /*
       Armstrong Sayı Nedir ?
       N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara
       Armstrong sayı denir.
     */
    private static boolean isArmstrongNumber(long number) {
        long total = 0, control = number;
        int power = numberOfDigits(number);
        do {
            total += Math.pow(control % 10, power);
        } while ((control /= 10) != 0);
        return total == number ? true : false;
    }

    private static int numberOfDigits(long number) {
        int result = 0;
        do {
            result++;
        } while ((number /= 10) != 0);
        return result;
    }

    private static int methodToFindTheSumOfPlaceValues(int number) {
        int result = 0;
        do {
            result += (number % 10);
        } while ((number /= 10) != 0);
        return result;
    }

    private static double harmonicSeries(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        return result;
    }

    private static double recursiveHarmonicSeries(int n) {
        if (n == 1)
            return 1;
        return recursiveHarmonicSeries(n - 1) + (1.0 / n);
    }

    private static void paintTriangleWithStars(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2; j++) {
                if (j >= height - i && j <= height + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void paintDiamondWithStars(int n) {

        int height = n, width = 2 * n;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j <= n + i && j >= n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < width + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j > i && j < width - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    private static void atmProgram() {
        String userName, password;
        int balance = 1500, right = 3, selection, exit = 0, amount;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınınız : ");
            userName = input.nextLine();

            System.out.print("Parolanız :");
            password = input.nextLine();
            if (userName.equals("Patika") && password.equals("123")) {
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println(
                            "1 Para yatırma\n" +
                                    "2 Para çekme\n" +
                                    "3 Bakiye sorgula\n" +
                                    "4 Çıkış yap"
                    );
                    System.out.print("Seçim : ");
                    selection = input.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.print("Para miktarı :");
                            balance += input.nextInt();
                            System.out.println("Yeni bakiye : " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı :");
                            amount = input.nextInt();
                            if (amount > balance) {
                                System.out.println("Yetersiz bakiye!");
                                break;
                            }
                            balance -= amount;
                            System.out.println("Yeni bakiye : " + balance);
                            break;
                        case 3:
                            System.out.println("Bakiye : " + balance);
                            break;
                        case 4:
                            System.out.println("Güle Güle");
                            exit++;
                            break;
                        default:
                            System.out.println("Geçersiz seçim yaptınız tekrar deneyiniz:");
                            break;
                    }
                } while (selection != 4);

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı yada şifre. ");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz!");
                } else {
                    System.out.println("Tekrar deneyiniz! Kalan hakkınız : " + right);
                }
            }
            if (exit == 1)
                System.exit(1);
        }
    }

    private static int ebob(int numberOne, int numberTwo) {
        int counter = 1, result = 1;
        while (numberOne / counter != 0 || numberTwo / counter != 0) {
            if (numberOne % counter == 0 && numberTwo % counter == 0)
                result = counter;
            counter++;
        }
        return result;
    }

    private static int ekok(int numberOne, int numberTwo) {
        int baseNumber, counter = 0;
        if (numberOne < numberTwo)
            baseNumber = numberOne;
        else
            baseNumber = numberTwo;
        while ((baseNumber * ++counter) % (Math.max(numberOne, numberTwo)) != 0) ;
        return baseNumber * counter;
    }

    private static int maxNumber(int[] numbers) {
        int result = numbers[0];
        for (var number : numbers) {
            result = Math.max(result, number);
        }
        return result;
    }

    private static int minNumber(int[] numbers) {
        int result = numbers[0];
        for (var number : numbers) {
            result = Math.min(result, number);
        }
        return result;
    }

    private static boolean isPerfectNumber(long number) {
        long result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                result += i;
        }
        return result == number;
    }

    private static void methodOfDrawingAnInvertedTriangleWithStars(int height) {
        for (int i = 0; i < height * 2; i++) {
            for (int j = 0; j < (height * 2 + 1); j++) {
                if (j >= i && j < (height * 2 + 1) - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static List<Integer> primeNumbersList(int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            if (isPrimeNumber(i))
                numbers.add(i);
        }
        return numbers;
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }


    private static List<Integer> fibonacciSeries(int countOfElements) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 1; i <= countOfElements; i++) {
            elements.add(nThFibonacciNumber(i));
        }
        return elements;
    }

    private static int nThFibonacciNumber(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        return nThFibonacciNumber(n - 1) + nThFibonacciNumber(n - 2);
    }

}

