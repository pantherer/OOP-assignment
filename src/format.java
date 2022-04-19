import java.util.Scanner;

public class format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter your roll number");
        String roll = scanner.nextLine();
        System.out.println("enter field of interest");
        String interest = scanner.nextLine();
        System.out.println("hey,my name is "+name+" my roll number is "+interest+" my field of interest is "+interest);

    }
}
