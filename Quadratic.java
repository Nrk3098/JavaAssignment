package JavaProgram;


import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {

    public static void main(String args[]) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the val1ue of a: ");
        double a=input.nextDouble();
        System.out.print("Enter the val1ue of b: ");
        double b=input.nextDouble();
        System.out.print("Enter the val1ue of c: ");
        double c=input.nextDouble();
        double d=b*b-4.0*a*c;
        double root1=0;
        double root2=0;
        if(d>0){
            System.out.println("roots are real and different");
            root1=(-b+sqrt(d))/(2*a);
            root2=(-b-sqrt(d))/(2*a);
            System.out.println("Root 1 of x "+ root1 +"Root 2 of x "+ root2);
        }
        else if(d == 0){
            System.out.println("roots are real and same");
            System.out.println("root is: " +(-b)/(2*a));
        }
        else{
            System.out.println("roots are complex");
        }







    }
}
