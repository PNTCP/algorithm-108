import java.util.Scanner;

public class ex4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Num1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please Enter Num2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Please Enter Num3: ");
        double num3 = scanner.nextDouble();

        System.out.print("Please Enter Num4: ");
        double num4 = scanner.nextDouble();

        System.out.print("Please Enter Num5: ");
        double num5 = scanner.nextDouble();

        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum/5;

        System.out.println("Summary = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}