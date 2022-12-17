package java101.practices.theProgramToFindHypotenuseInRightTriangle;
/*
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class Triangle {
    private double kenarBir , kenarIki , kenarUc ;

    Triangle(double kenarBir , double kenarIki , double kenarUc){
        this.kenarBir = kenarBir ;
        this.kenarIki = kenarIki ;
        this.kenarUc  = kenarUc  ;
    }

    private double primeterOfTriangle(){
        return kenarBir+kenarIki+kenarUc;
    }

    private double areaofTriangle(){
        double ucgeninYariCevreUzunlugu = primeterOfTriangle()/2;
        double ucgeninAlanininKaresi =  (ucgeninYariCevreUzunlugu)*
                                        (ucgeninYariCevreUzunlugu-kenarBir)*
                                        (ucgeninYariCevreUzunlugu-kenarIki)*
                                        (ucgeninYariCevreUzunlugu-kenarUc);
        return Math.sqrt(ucgeninAlanininKaresi);
    }

    @Override
    public String toString(){
        return "-----Üçgen-----" +
                "\nKenar bir :" +
                kenarBir        +
                "\nKenar iki :" +
                kenarIki        +
                "\nKenar üç  :" +
                kenarUc         +
                "\nÇevresi   :" +
                primeterOfTriangle()+
                "\nAlani     :" +
                areaofTriangle();
    }


}
