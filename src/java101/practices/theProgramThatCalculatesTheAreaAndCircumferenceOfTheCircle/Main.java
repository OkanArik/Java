package java101.practices.theProgramThatCalculatesTheAreaAndCircumferenceOfTheCircle;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius , centerAngle ;
        Scanner input = new Scanner(System.in);

        System.out.println("Tam bir dairenin alanı ve çevresini hesaplamak için dairenin yarıçapını giriniz : ");
        System.out.print("Dairenin yarıçapını giriniz :");
        radius = input.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle.toString());

        System.out.println("Alanını ve çevresini hesaplamak istediğiniz dairenin sırası ile yarıçapı ve merkez açısını giriniz : ");
        System.out.print("Dairenin yarıçapını giriniz : ");
        radius = input.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz : ");
        centerAngle = input.nextDouble();

        Circle circle1 = new Circle(radius,centerAngle);
        System.out.println(circle1.toString());
    }
}
