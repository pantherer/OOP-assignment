import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  principal");
        double principal = scanner.nextDouble();
        System.out.println("enter time");
        double time = scanner.nextDouble();
        System.out.println("enter rate");
        double rate = scanner.nextDouble();
        double interest = (principal * time * rate) / 100;
        System.out.println(interest);

    }
}
