import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int square =  number*number;
        System.out.println("square of number is "+square);

    }
}
