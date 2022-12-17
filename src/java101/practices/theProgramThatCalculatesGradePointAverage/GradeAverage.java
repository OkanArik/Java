package java101.practices.theProgramThatCalculatesGradePointAverage;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mathematics , physic , chemistry , turkish , history , music ;

        System.out.print("Enter mathematics grade : ");
        mathematics = input.nextDouble();

        System.out.print("Enter physic grade      : ");
        physic = input.nextDouble();

        System.out.print("Enter chemistry grade   : ");
        chemistry = input.nextDouble();

        System.out.print("Enter turkish grade     : ");
        turkish = input.nextDouble();

        System.out.print("Enter history grade     : ");
        history = input.nextDouble();

        System.out.print("Enter music grade       : ");
        music = input.nextDouble();

        double gradeAverage = (mathematics+physic+chemistry+turkish+history+music)/6 ;

        System.out.println("Grade Average : "+gradeAverage);
        System.out.println((gradeAverage<50?"You Have Failed!":"You Have Passed!"));
    }
}
