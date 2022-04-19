import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        int area = (int) ((int) length*breadth);
        System.out.println("area of rectangle is "+area);



    }
}
