package java101.practices.theProgramToFindHypotenuseInRightTriangle;

import java.util.Scanner;

public class programToFindHypotenuseInRightTriangle {
    public static void main(String[] args) {
        // Hipotenüs       = ((dikKenarBir^2)+(dikKenarIki^2))^1/2
        // Üçgenin çevresi = dikKenarBir + dikKenarIki + Hipotenüs
        // Dik Üçgenin alanı   = (dikKenarBir*dikKenarIki)/2
        double dikKenarBir , dikKenarIki , hipotenus , alan , cevre ;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik üçgenin iki dik kenarını sıra ile giriniz : ");
        System.out.print("Dik kenar bir : ");
        dikKenarBir = input.nextDouble();
        System.out.print("Dik kenar iki : ");
        dikKenarIki = input.nextDouble();

        hipotenus = Math.sqrt((Math.pow(dikKenarBir,2)+Math.pow(dikKenarIki,2)));
        cevre = dikKenarBir + dikKenarIki + hipotenus ;
        alan  = (dikKenarBir*dikKenarIki)/2 ;
        System.out.println("-----Dik üçgen-----");
        System.out.println("Dik kenar bir :"+dikKenarBir);
        System.out.println("Dik kenar iki :"+dikKenarIki);
        System.out.println("Hipotenüs     :"+hipotenus);
        System.out.println("Çevre         :"+cevre);
        System.out.println("Alan          :"+alan);

        Triangle triangle  = new Triangle(dikKenarBir ,dikKenarIki ,hipotenus);
        System.out.println(triangle.toString());

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println(triangle1.toString());

    }
}
