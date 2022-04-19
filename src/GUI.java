import javax.swing.*;

public class GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog(null,("enter your name"));
        String sirname = JOptionPane.showInputDialog(null,("enter your sirname"));
        int age = Integer.parseInt (JOptionPane.showInputDialog(" enter  your age "));

        JOptionPane.showMessageDialog(null," your name is "+name+" your sir name is "+sirname);
        System.exit(0);

    }


}
