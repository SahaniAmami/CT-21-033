package Q_10;

import java.util.Scanner;
public class Q_10 {
    public static void main(String[] args) {
        final int MONTH_IN_YEAR=12;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the loan amount:");
        double amount= scanner.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate=scanner.nextDouble();
        System.out.println("Enter the loan period: ");
        int loanPeriod=scanner.nextInt();
        double monthlyInterestRate=annualInterestRate / 100.0 / MONTH_IN_YEAR;
        int numberOfPayment= loanPeriod * MONTH_IN_YEAR;
        double monthlyPayment= (amount * monthlyInterestRate) / (1-Math.pow(1/(1+monthlyInterestRate),numberOfPayment));
        double totalPayment= monthlyPayment * numberOfPayment;
        System.out.println("Monthly Payment : " +monthlyPayment);
        System.out.println("Total Payment: " +totalPayment);
    }
}
