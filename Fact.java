import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
    
    public static int factorial(int num) {
        if (num == 0) return 1;
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
