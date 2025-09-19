import java.util.Scanner;

public class MemberDis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter membership level (Silver, Gold, Platinum, Other): ");
        String memberLv = scanner.nextLine();

        System.out.print("Enter total purchase amount: ");
        double total = scanner.nextDouble();

        System.out.println();
        System.out.println("--- Result ---");
        System.out.println("Member level: " + memberLv);
        System.out.println("Total purchase: " + total);

        if (memberLv.equalsIgnoreCase("Silver")) {
            discount = 0.05;
        } else if (memberLv.equalsIgnoreCase("Gold")) {
            discount = 0.10;
        } else if (memberLv.equalsIgnoreCase("Platinum")) {
            discount = 0.15;
        } else if (memberLv.equalsIgnoreCase("Other")) {
            discount = 0.0;
        } else {
            System.out.println("xx Not found xx");
            System.exit(1);
        }

        double discountAmount = total * discount;
        double netTotal = total - discountAmount;

        System.out.println("Discount: " + discountAmount);
        System.out.println("Final price: " + netTotal);
    }
}
