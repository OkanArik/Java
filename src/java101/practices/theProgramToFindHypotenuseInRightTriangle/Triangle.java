package java101.practices.theProgramToFindHypotenuseInRightTriangle;
/*
ΓΓ§πππππ Γ§ππ£πππ π = 2π’
π’ = (a+b+c) / 2
Alan * Alan = π’ * (π’ β π)* (π’ β π) * (π’ β π)
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
        return "-----ΓΓ§gen-----" +
                "\nKenar bir :" +
                kenarBir        +
                "\nKenar iki :" +
                kenarIki        +
                "\nKenar ΓΌΓ§  :" +
                kenarUc         +
                "\nΓevresi   :" +
                primeterOfTriangle()+
                "\nAlani     :" +
                areaofTriangle();
    }


}
