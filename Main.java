import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the user input (a line of text)

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read the user input (an integer)

        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();  // Read the user input (a floating-point number)

        
        System.out.println("\nUser Information:");
        System.out.println("Name:
        