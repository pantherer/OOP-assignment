import java.util.Scanner;

public class sun_product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two integers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        int product = a*b;

        double div = (double) ((double)sum/product);
        System.out.println("division os sum and product is"+div);



    }
}
