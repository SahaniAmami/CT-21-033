package Q_04;
import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your bodyWeight");
        float W= scan.nextFloat();
        double calorie=(W*19);
        System.out.println(calorie);
    }
}
