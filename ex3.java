import java.util.Scanner;

public class ex3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Your Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Please Enter Tax: ");
        double tax = scanner.nextDouble();

        double sum = salary * tax;

        System.out.print("Your Tax = " + sum + " Bath");
        scanner.close();
    }
}