import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
