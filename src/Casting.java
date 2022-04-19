import java.util.Scanner;

public class Casting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        double length = scanner.nextDouble();
        System.out.println("enter  breadth");
        double breadth = scanner.nextDouble();
        double area = length*breadth;
        int castedArea=(int) (area);
        System.out.println("Area is "+castedArea);
    }

}
