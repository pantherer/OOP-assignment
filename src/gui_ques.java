import javax.swing.*;
import java.util.Scanner;

//    day 3.. use JOptionPane for User I/O
class ques1{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your name: " )));
        String third=((JOptionPane.showInputDialog("enter your Address: " )));
        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter your Phone: " )));
        int Fourth=Integer.parseInt((JOptionPane.showInputDialog("enter your marks scored: " )));

        JOptionPane.showMessageDialog(null,"My name is "+first+"\n My address is "
                +third+"\n my phone number is "+Second+"\n"+first+" has scored "+Fourth+" marks.");
    }
}

class ques2{
    public static void main(String[] args) {
        int First=Integer.parseInt((JOptionPane.showInputDialog("enter the first number: " )));
        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter the second number: " )));
        int Third=Integer.parseInt((JOptionPane.showInputDialog("enter the third number: " )));
        int Fourth=Integer.parseInt((JOptionPane.showInputDialog("enter your fouth number: " )));

        int sum=First+Second+Third+Fourth;
        JOptionPane.showMessageDialog(null,"The sum of given inputs is "+sum);
    }
}
class ques3{
    public static void main(String[] args) {
        String name=((JOptionPane.showInputDialog("enter your name: " )));
        double A=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of maths: ")));
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
        double sum=A+B+C+D;
        double per= sum/4;
        int percentint=(int)per;
        if (percentint>=70) {
            JOptionPane.showMessageDialog(null ,name+" has Scored "+" First division");
        }
        else if(percentint>=50){
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Second division");
        }
        else if (percentint>=40){
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Third division");
        }
        else {
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Fail");
        }
    }
}



class ques4{
    public static void main(String[] args) {

        int First = Integer.parseInt((JOptionPane.showInputDialog("enter the first number: ")));
        int Second = Integer.parseInt((JOptionPane.showInputDialog("enter the second number: ")));
        int sum = First + Second;
        int Pro = First * Second;
        JOptionPane.showMessageDialog(null,"The sum is: "+sum);
        JOptionPane.showMessageDialog(null,"The product is: "+Pro);
    }
}
class ques5{
    public static void main(String[] args) {
        int First = Integer.parseInt((JOptionPane.showInputDialog("enter the first number: ")));
        int Second = Integer.parseInt((JOptionPane.showInputDialog("enter the second number: ")));
        int sum = First + Second;
        int Pro = First * Second;
        float div= sum/Pro;
        JOptionPane.showMessageDialog(null,"The division is: "+div);
    }
}
class ques6{
    public static void main(String[] args) {
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double Area=B*C;
        int AA=(int)Area;
        JOptionPane.showMessageDialog(null,"The area is: "+AA);

    }
}
class ques7{
    public static void main(String[] args) {
        String A=((JOptionPane.showInputDialog("enter your name: " )));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the roll number: ")));
        String C=((JOptionPane.showInputDialog("enter field of intrest: " )));
        JOptionPane.showMessageDialog(null,"My name is "+A+ " and my roll number is "+B+" " +
                "and my field of interest is "+C+".");

    }
}
class ques8{
    public static void main(String[] args) {
        float A= Float.parseFloat(JOptionPane.showInputDialog("enter the length of square: "));
        float Area=A*A;
        float perimeter=4*A;
        JOptionPane.showMessageDialog(null,"The area of square is "+Area +" and the perimeter is "+perimeter);
    }
}

class ques9{
    public static void main(String[] args) {
        double A=Double.parseDouble(JOptionPane.showInputDialog("Enter the number: "));
        double Square =A*A;
        JOptionPane.showMessageDialog(null,"The square of "+A+" is "+Square);
    }
}

class ques10{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your First Name: " )));
        String Second=((JOptionPane.showInputDialog("enter your Second Name: " )));
        JOptionPane.showMessageDialog(null,first+" "+Second);

    }
}
class ques11{
    public static void main(String[] args) {
        int A = Integer.parseInt((JOptionPane.showInputDialog("enter the First number: ")));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the Second number: ")));
        int C = Integer.parseInt((JOptionPane.showInputDialog("enter the Third number: ")));
        String check=((A==B)&&(A==C)) ?"All three are equal": (A==B)?"A and B are equal":(A==C)?"A and C are Equal":(B==C)?"B ans C are equal":"nothing is same";

        JOptionPane.showMessageDialog(null,check);
    }
}

class ques12{
    public static void main(String[] args) {
        int A = Integer.parseInt((JOptionPane.showInputDialog("enter the First number: ")));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the Second number: ")));
        boolean AA=(A<B)&& (A<50);
        JOptionPane.showMessageDialog(null,AA);
    }
}

class ques13{
    public static void main(String[] args) {
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
        double sum=B+C+D;
        double per= sum/4;
        int percentint=(int)per;
        JOptionPane.showMessageDialog(null,"Robert has scored: "+ percentint +"%");
    }
}
