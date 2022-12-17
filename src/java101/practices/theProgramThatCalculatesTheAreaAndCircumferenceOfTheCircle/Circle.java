package java101.practices.theProgramThatCalculatesTheAreaAndCircumferenceOfTheCircle;

/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class Circle {
    private final static double Pi = 3.14;
    private double radius, centerAngle = 360;


    Circle(double radius, double centerAngle) {
        this(radius);
        this.centerAngle = centerAngle;
    }

    Circle(double radius) {

        this.radius = radius;
    }

    private double theAreaOfTheCircle() {
        return (Pi * Math.pow(radius, 2) * centerAngle) / 360;
    }

    private double theCircumferenceOfTheCircle() {
        return 2 * Pi * radius;
    }

    @Override
    public String toString() {
        return "Dairenin alanı   : " +
                theAreaOfTheCircle() +
                "\nDairenin çevresi : " +
                theCircumferenceOfTheCircle();
    }
}
