package Q_02;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values in centimeters");
        float value= scan.nextFloat();
        float outputInch = (float) (value/2.54);
        float outputFeet= (float) (outputInch/12);
        System.out.println(outputInch);
        System.out.println(outputFeet);

    }
}
