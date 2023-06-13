package JavaProgram;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        if((month == 3 && day>=16 && day<=31)||(month == 4 && day>=1 && day<=30)||(month ==5 && day>=1 && day<=31)||(month==6 && day>=1 && day<=15))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");

        }

    }
}
