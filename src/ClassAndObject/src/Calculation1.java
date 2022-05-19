import java.util.Scanner;

public class Calculation1 {
    public static void main(String[] args) {
        ArithmeticCalc calcu= new ArithmeticCalc();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        calcu.a = sc.nextInt();
        System.out.println("enter second number");
        calcu.b=sc.nextInt();
        System.out.println("addition is  "+calcu.OpetationAdd(calcu.a,calcu.b));
        System.out.println("subtraction is  "+calcu.OperationSub(calcu.a,calcu.b));
        System.out.println("multipication is  "+calcu.OperationMulti(calcu.a,calcu.b));
        System.out.println(" division is  "+calcu.OperationDiv(calcu.a,calcu.b));

    }

}
