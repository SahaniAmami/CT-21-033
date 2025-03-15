package Q_05;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values in fahrenheit");
        double fahrenheit= scan.nextDouble();
        double celsius= (fahrenheit-32)*5/9;
        System.out.println(celsius);

    }
}
