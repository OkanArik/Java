package java101.practices.theProgramThatGreengrocerCashRegisterRegister;

import java.util.Scanner;

public class CashRegister {
    private double pear = 2.14 , apple = 3.67 , tomatoes = 1.11 , banana = 0.95 , aubergine = 5.00 ;
    private int pearKg , appleKg , tomatoesKg , bananaKg , aubergineKg ;

    CashRegister(){}

    public double getPear() {
        return pear;
    }

    public double getApple() {
        return apple;
    }

    public double getTomatoes() {
        return tomatoes;
    }

    public double getBanana() {
        return banana;
    }

    public double getAubergine() {
        return aubergine;
    }

    public void setPear(double pear) {
        this.pear = pear;
    }

    public void setApple(double apple) {
        this.apple = apple;
    }

    public void setTomatoes(double tomatoes) {
        this.tomatoes = tomatoes;
    }

    public void setBanana(double banana) {
        this.banana = banana;
    }

    public void setAubergine(double aubergine) {
        this.aubergine = aubergine;
    }

    private void enterKg(){
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?        : ");
        this.pearKg = input.nextInt();
        System.out.print("Elma Kaç Kilo?         : ");
        this.appleKg = input.nextInt();
        System.out.print("Domates Kaç Kilo?      : ");
        this.tomatoesKg = input.nextInt();
        System.out.print("Muz Kaç Kaç Kilo?      : ");
        this.bananaKg = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo?     : ");
        this.aubergineKg = input.nextInt();
    }

    private double totalPrice(){
        return pear*pearKg+apple*appleKg+tomatoes*tomatoesKg+banana*bananaKg+aubergine*aubergineKg;
    }

    @Override
    public String toString() {
        enterKg();
        return pearKg+"kg armut = "+(pear*pearKg)+
                "TL\n"+appleKg+"kg elma = "+(apple*appleKg)+
                "TL\n"+tomatoesKg+"kg domates = "+(tomatoes*tomatoesKg)+
                "TL\n"+bananaKg+"kg muz = "+(banana*bananaKg)+
                "TL\n"+aubergineKg+"kg patlıcan = "+(aubergine*aubergineKg)+
                "TL\n"+"Toplam tutar = "+totalPrice();
    }
}
