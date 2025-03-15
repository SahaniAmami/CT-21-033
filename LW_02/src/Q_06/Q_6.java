package Q_06;

import java.util.Scanner;
import java.time.Year;

public class Q_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int currentYear= Year.now().getValue();
        System.out.println("Enter your year of Birth");
        int birthYear= scan.nextInt();
        int age= (currentYear-birthYear);
        System.out.println("You were born in " + birthYear + " and will be(are) " + age + " this year");

    }
}
