package Q_09;

import java.util.Scanner;
public class Q_9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("invest dollars:");
        double P=scan.nextDouble();
        System.out.println("Enter the percentage:");
        double R=scan.nextDouble();
        System.out.println("how many years:");
        int N=scan.nextInt();
        double Amount=P*(1 + Math.pow((R/100),N));
        System.out.println("amount is: " +Amount);
    }
}
