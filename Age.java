import java.util.Scanner;

public class Age{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age > 10){
            System.out.print("Take 2 teanspoons");
        }else if(age > 3){
            System.out.print("Take 1 teanspoons");
        }else if(age > 1){
            System.out.print("Take 1/2 teanspoons");
        }else if (age <= 0){
            System.out.print("Wrong Age");
        }else{
            System.out.print("Do not take medicine");
        }
    }
}