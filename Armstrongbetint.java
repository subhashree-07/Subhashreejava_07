import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range start: ");
        int start = scanner.nextInt();
        System.out.print("Enter the range end: ");
        int end = scanner.nextInt();
        
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }
    
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        num = original;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
}
