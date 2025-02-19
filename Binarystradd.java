import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String a = scanner.nextLine();
        System.out.print("Enter second binary number: ");
        String b = scanner.nextLine();
        
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        String sumBinary = Integer.toBinaryString(sum);
        System.out.println("The sum of binary numbers is: " + sumBinary);
    }
}
