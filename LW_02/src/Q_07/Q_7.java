package Q_07;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        double weight=scan.nextDouble();
        System.out.println("Enter your height in centimeter");
        double height=scan.nextDouble();
        double bmi=weight / Math.pow(height / 100.0,2);
        System.out.println(bmi);
        if(bmi>=20 && bmi<=25) {
            System.out.println("normal");
        }
    }
}
