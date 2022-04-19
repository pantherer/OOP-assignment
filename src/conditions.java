import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value");
        int a = scanner.nextInt();
        System.out.println("enter second value");
        int b = scanner.nextInt();
        System.out.println((a<50)&&(a<b));
    }
}
