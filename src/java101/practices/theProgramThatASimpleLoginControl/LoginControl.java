package java101.practices.theProgramThatASimpleLoginControl;

import java.util.Scanner;

public class LoginControl {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz         : ");
        password = input.nextLine();

        if(userName.equals("Okan") && password.equals("12345")){
            System.out.println("Giriş Yaptınız !");
        }else {
            System.out.println("Bilgileriniz Yanlış !");
        }

    }
}
