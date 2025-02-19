import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = scanner.nextDouble();
        System.out.print("Enter time period in years: ");
        double t = scanner.nextDouble();
        System.out.print("Enter number of times interest applied per year: ");
        double n = scanner.nextDouble();
        
        double compoundInterest = p * Math.pow((1 + r / (100 * n)), n * t) - p;
        System.out.println("The compound interest is: " + compoundInterest);
    }
}
