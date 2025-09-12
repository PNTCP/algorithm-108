import java.util.Scanner;

public class calMerchant {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the product (perunit) : ");
        int price = scanner.nextInt();

        System.out.print("Enter the quantity of the product : ");
        int quantity = scanner.nextInt();
        double total = price * quantity;

        if(quantity > 10){
            System.out.println("You get a 10% discount!");
            double discount = total * 0.1;
            double totalDis = total - discount;
            System.out.println("Total price : " + totalDis + " Baht");
        }else{
            System.out.println("Total price : " + total + " Baht");
        }


    }
}