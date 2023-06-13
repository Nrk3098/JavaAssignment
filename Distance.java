package JavaProgram;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the val1ue of x1: ");
        int x1=input.nextInt();
        System.out.print("Enter the val1ue of x2: ");
        int x2=input.nextInt();
        System.out.print("Enter the val1ue of y1: ");
        int y1=input.nextInt();
        System.out.print("Enter the val1ue of y2: ");
        int y2=input.nextInt();
        double distance;

        distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            System.out.println("Distance between two point "+"("+x1+","+y1+"),"+"("+x2+","+y2+")=="+distance);

    }
}
