package java101.practices.theProgramThatGreengrocerCashRegisterRegister;
/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

bu program için CashRegister (YazarKasa) sınıfı yazılmıştır.
 */
public class Main {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        System.out.println(cashRegister.toString());
    }
}
