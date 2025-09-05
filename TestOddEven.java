import java.util.Scanner;

public class TestOddEven {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        int number = scanner.nextInt();
        int sum = number % 2;

        if(sum == 0){
            System.out.println("The number " + number + " is Even");
        }else{
            System.out.println("The number " + number + " is Odd");
        }
    }
}