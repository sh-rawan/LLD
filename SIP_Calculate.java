import java.text.NumberFormat;
import java.util.Scanner;

public class SIP_Calculate {
    public static void main(String[] args) {
        boolean custom = false;
        double interest_rate = 40;
        double investment_years = 15;
        double SIP_amount = 130000;
        double initial_amount = 4000000;

        // NumberFormat format = NumberFormat.getInstance();
        if (custom) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input initial amount : ");
            initial_amount = scanner.nextDouble();
            System.out.println("Input SIP amount : ");
            SIP_amount = scanner.nextDouble();
            System.out.println("input expected interest rate : ");
            interest_rate = scanner.nextDouble();
            System.out.println("number of investment investment_years : ");
            investment_years = scanner.nextDouble();
            scanner.close();
        }

        double monthly_rate = Math.exp(Math.log(interest_rate / 100 + 1) / 12) - 1;
        double final_amount = initial_amount * Math.pow((1 + monthly_rate), investment_years * 12)
                + SIP_amount * (Math.pow((1 + monthly_rate), investment_years * 12 + 1) - 1) / monthly_rate;

        monthly_rate = 0.001;
        double invested_amount = initial_amount * Math.pow((1 + monthly_rate), investment_years * 12)
                + SIP_amount * (Math.pow((1 + monthly_rate), investment_years * 12 + 1) - 1) / monthly_rate;
        System.out.print("You will get the total sum of : " + NumberFormat.getInstance().format((int) final_amount));
        System.out.println();
        System.out.print("Your invested amount is " + NumberFormat.getInstance().format((int) invested_amount));
        System.out.println();
        // System.out.printf("%.2f",SIP_amount * (Math.pow((1 + monthly_rate),
        // investment_years * 12 + 1) - 1) / monthly_rate);
    }
}
