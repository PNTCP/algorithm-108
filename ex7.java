import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Length: ");
        int length = scanner.nextInt();

        System.out.print("Please Enter Width: ");
        int width = scanner.nextInt();

        int area = length * width;

        System.out.print("Area of Rectangle = " + area + " Square Units");
    }
}