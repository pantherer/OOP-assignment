import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter four numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int add = a+b+c+d;
        System.out.println("total sum is "+add);


    }
}
