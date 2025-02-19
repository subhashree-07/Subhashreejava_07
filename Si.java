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
        
        double simpleInterest = (p * r * t) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
