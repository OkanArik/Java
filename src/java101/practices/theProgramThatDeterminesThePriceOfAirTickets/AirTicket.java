package java101.practices.theProgramThatDeterminesThePriceOfAirTickets;

import java.util.Scanner;

public class AirTicket {
    double distance, age, flightType, pricePerKm = 0.1;

    AirTicket() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bilet fiyatınızın belirlenmesi için aşağıdaki bilgileri sırası ile giriniz.");
        System.out.print("Mesafe (km)                             : ");
        this.distance = input.nextDouble();
        System.out.print("Yaşınız                                 : ");
        this.age = input.nextDouble();
        System.out.print("Uçuş türü (Tek-Yön:1) (Gidiş-Dönüş:2)   : ");
        this.flightType = input.nextDouble();
        control();
    }

    private void control() {
        if (age <= 0 || flightType > 2 || flightType < 1) {
            System.out.println("Hatalı veri girdiniz!");
            System.exit(1);
        }
    }

    private double priceOfTicket() {
        double totalPrice = distance * pricePerKm
                * (age < 12 ? 0.5 : (age < 24 ? 0.9 : (age > 65 ? 0.7 : 1)))
                * (flightType == 1 ? 1 : 1.6);
        return totalPrice ;
    }

    @Override
    public String toString() {
        return "Uçuş mesafesi    : "+distance+" km." +
                "\nYaşınız         : "+age+
                "\nYolculuk tipiniz: "+(flightType==2?"Gidiş-Dönüş":"Tek-Yön")+
                "\nToplam tutar    : "+priceOfTicket();
    }

}
