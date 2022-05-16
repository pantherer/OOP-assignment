import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_lists {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();//initializing arraylist
        myArrayList.add(12);//adding without index
        myArrayList.add(0,13);//adding with index
        myArrayList.add(0,14);
        myArrayList.add(0,12);
        Collections.sort(myArrayList); //sorting my array list
        System.out.println(myArrayList);
        myArrayList.clear(); //clearing arraylist
        System.out.println(myArrayList.size()); //display arraylist length
    }
}

class Array_listss {
    public static void main(String[] args) {
        ArrayList<String> myArrayLists = new ArrayList<String>();//initializing arraylist
        myArrayLists.add("amul");//adding without index
        myArrayLists.add(0, "bashyal");//adding with index
        myArrayLists.add(0, "butwal");
        myArrayLists.add(0, "21");
        //String data = myArrayLists.get(3); //getting 1st index value
        //System.out.println(data);
       // Collections.sort(myArrayLists); //sorting my array list
        //System.out.println(myArrayLists);
        //myArrayList.clear(); //clearing arraylist
        for (String i:myArrayLists) {
            System.out.println(i); //display arraylist length
        }
    }
}

class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter how many prime numbers you wanna enter");
        int a = sc.nextInt();
        ArrayList<Integer> mylist = new ArrayList<Integer>(5);
        for (int i = 0; i < a; i++) {
            System.out.println("enter prime number");
            int b = sc.nextInt();
            mylist.add(b);
        }
        System.out.println(Sumprime(mylist));
    }

    public static int Sumprime(ArrayList<Integer> mylist) {
        int sum = 0;
        for (int i : mylist) {
            sum = sum + i;
        }
        System.out.println(sum);

        return sum;
    }
}


