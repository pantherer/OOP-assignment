import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        SimpleInterest total = new SimpleInterest();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle");
        total.principle = sc.nextFloat();
        System.out.println("enter time");
        total.time = sc.nextFloat();
        System.out.println("enter rate");
        total.rate = sc.nextFloat();

        System.out.println("interest is"+total.calculation(total.principle,total.time,total.rate));

    }

}

// ------------------Assignment-------------------------
// create a new class as arithmetic where you have to create function
// with return type for all kinds of arithmetic operation like addition,subtraction,multipication
