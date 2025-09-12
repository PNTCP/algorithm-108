import java.util.Scanner;

public class NumSwap {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Current -> number1 = " + num1 + " and number2 = " + num2 );
        System.out.println("Swapping . . . . . . . . .");
        
        int temp = num1;
        num1 = num2;
        num2 = temp;
    
        System.out.println("Now -> number1 = " + num1 + " and number2 = " + num2 );



    }
}