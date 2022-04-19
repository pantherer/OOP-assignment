import java.util.Scanner;

public class area_peri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of square");
        int length = scanner.nextInt();
        int area = length*length;
        int perimeter = 4*length;
        System.out.println("area of square is "+area+" and its perimeter is "+perimeter);


    }
}
