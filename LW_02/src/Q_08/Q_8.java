package Q_08;

import java.util.Scanner;
public class Q_8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double radius=scan.nextDouble();
        double volume= (4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.println("Volume of sphere is: " +volume);
    }
}
