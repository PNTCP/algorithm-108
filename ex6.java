import java.util.Scanner;

public class ex6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Please Enter Number : ");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.print(num1 + " Is Even Number");
        }else {
            System.out.print(num1 + " Is Odd Number");
        }
    }
}