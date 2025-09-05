import java.util.Scanner;

public class Number {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            int sum = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + sum);
        }else if(number1 < number2){
            int sum = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + sum);
        }else {
            System.out.println("Wrong Number");
        }
    }
}