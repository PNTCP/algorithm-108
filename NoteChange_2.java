import java.util.Scanner;

public class NoteChange_2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product price: ");
        int price = scanner.nextInt();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        int pay = price * quantity;

        if(pay > 1000){
            System.out.print("Not enough money!!");
        }else{
            int change = 1000 - pay;
            System.out.println("Change: " + change + " baht");

            int fiveHun = change / 500;
            change = change % 500;
            System.out.println("Five-hundred note: " + fiveHun + " note(s)" );

            int oneHun = change / 100;
            change = change % 100;
            System.out.println("Hundred note: " + oneHun + " note(s)" );

            int fifTy = change / 50;
            change = change % 50;
            System.out.println("Fifty note: " + fifTy + " note(s)" );

            int twenTy = change / 20;
            change = change % 20;
            System.out.println("Twenty note: " + twenTy + " note(s)" );

            int tenC = change / 10;
            change = change % 10;
            System.out.println("Ten coin: " + tenC + " coin(s)" );

            int fiveC = change / 5;
            change = change % 5;
            System.out.println("Five coin: " + fiveC + " coin(s)" );

            int twoC = change / 2;
            change = change % 2;
            System.out.println("Two coin: " + twoC + " coin(s)" );

            int oneC = change / 1;
            change = change % 1;
            System.out.println("One coin: " + oneC + " coin(s)" );
        }

    }
}