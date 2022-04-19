import java.util.Scanner;

public class student_detail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter full name");
        String name = scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("your name is "+name+" and your age is "+age);


    }
}
