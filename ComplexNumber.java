import java.util.Scanner;

class ComplexNumber {
    double real, imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        
        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);
        
        ComplexNumber sum = c1.add(c2);
        System.out.println("The sum of complex numbers is: " + sum);
    }
}
