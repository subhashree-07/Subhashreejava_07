import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int n = scanner.nextInt();
        
        System.out.println("Sum of even Fibonacci numbers till " + n + " is: " + sumEvenFibonacci(n));
    }
    
    public static int sumEvenFibonacci(int n) {
        int a = 0, b = 1, sum = 0;
        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return sum;
    }
}
