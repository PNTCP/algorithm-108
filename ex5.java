import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Please Enter Num2L ");
        int num2 = scanner.nextInt();

        int plus = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;

        System.out.print("Plus : " + plus + " Minus : " + minus +  " Multiply : " + multiply + " Divide : " + divide);
    }
}