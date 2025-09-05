import java.util.Scanner;

public class IfShape {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        System.out.print("Number = ");    
        int number = scanner.nextInt();  

        if (number == 1) {
            System.out.print("Enter base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter height of the triangle: ");
            double height = scanner.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Area of the triangle: " + area + " square units");

        } else if (number == 2) {
            System.out.print("Enter weight in kilogram: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height in meter: ");
            double meter = scanner.nextDouble();
            double bmi = weight / (meter * meter);
            System.out.println("Your BMI for weight = " + weight + " and height = " + meter + " meters is : " + bmi + " bmi");

        } else {
            System.out.println("Wrong Number 1 , 2");
        }
    }
}
