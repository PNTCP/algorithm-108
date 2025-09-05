import java.util.Scanner;

public class NumberMF {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1 = MALE // 2 = FEMALE ");
        int numberMF = scanner.nextInt();

        if(numberMF == 1){
            System.out.print("Enter your weight: ");
            int weight = scanner.nextInt();
            System.out.print("Enter your height .cm: ");
            int height = scanner.nextInt();
            System.out.print("Enter your old: ");
            int old = scanner.nextInt();
            double bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * old);
            System.out.println("Your BMR : " + bmr);
        }else if(numberMF == 2){
            System.out.print("Enter your weight: ");
            int weight = scanner.nextInt();
            System.out.print("Enter your height .cm: ");
            int height = scanner.nextInt();
            System.out.print("Enter your old: ");
            int old = scanner.nextInt();
            double bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * old);
            System.out.println("Your BMR : " + bmr);
        }else {
            System.out.println("Wrong Number");
        }
    }
}