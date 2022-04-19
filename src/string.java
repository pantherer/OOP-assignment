import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first string");
        String first = scanner.nextLine();
        System.out.println("enter second string");
        String second = scanner.nextLine();
        System.out.print(first+second);
    }
}
