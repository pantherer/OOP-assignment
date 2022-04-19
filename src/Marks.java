import javax.swing.*;
public class Marks {
    public static void main(String[] args){
        int OOP = Integer.parseInt (JOptionPane.showInputDialog(" enter marks of OOP:"));
        int computing = Integer.parseInt (JOptionPane.showInputDialog(" enter marks of computing:"));
        int database = Integer.parseInt (JOptionPane.showInputDialog(" enter marks of database:"));
        int architecture = Integer.parseInt (JOptionPane.showInputDialog(" enter marks of architecture:"));
        double total_marks = (double) (OOP + computing + database + architecture);
        double percentage = total_marks/4;
        JOptionPane.showMessageDialog(null,"total marks is "+percentage);

    }


    }
