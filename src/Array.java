import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddEven[] = new int[10];
        int even = 0, odd = 0;
        System.out.println("enter number");
        for (int i = 0; i < 10; i++) {
            oddEven[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (oddEven[i] % 2 == 0) {
                even = even + 1;
            }
            else{
                odd = odd + 1;
            }
        }
        Checking(odd,even);

    }
        public static void Checking(int oddnum,int evennum){
            System.out.println(oddnum);
            System.out.println(evennum);
        }

}
class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int add=0,average=0;
        int num[] = new int[5];
        for (int i=0;i<5;i++){
            num[i]= sc.nextInt();
        }
        for (int i=0;i<5;i++){
            add = add+num[i];
            average=add/5;
        }
        System.out.println(average);
    }
}
class checknum{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");

        int arr[]= new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        checkElement( arr);
    }
    public static void checkElement(int arr[]){
        System.out.println("enter number to check");
        Scanner sc = new Scanner(System.in);
        int numcheck = sc.nextInt();
        int a;
        for (int i=0;i<5;i++){
            if (numcheck==arr[i]){
                a=i;
                System.out.println("found at location "+i);
                break;
            }
            else if(numcheck!=arr[i]){
                continue;
            }

        }
        System.out.println("NOt found");
    }
}

class MultiArray{
    public static void main(String[] args) {
        int Multi[][]= new int[2][2];
        Multi[0][0]=1;
        Multi[0][1]=2;
        Multi[1][1]=3;
        Multi[1][0]=4;
        System.out.println(Arrays.deepToString(Multi));
    }
}

class Reco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col = 2;
        String [][] arr = new String[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("enter your name and age ");
                arr[i][j]=sc.nextLine();
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}

class AddMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col= 3;
        int arr[][]=new int[row][col];
        int arr1[][]= new int [row][col];
        int arr2[][]=new int[row][col];

        System.out.println("enter the  first matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the  second matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]= arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("the new arrays after addition is"+Arrays.deepToString(arr2));
    }
}

class MultiMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col= 3;
        int arr[][]=new int[row][col];
        int arr1[][]= new int [row][col];
        int arr2[][]=new int[row][col];

        System.out.println("enter the  first matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the  second matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=(arr[i][j]*arr1[i][j]);

            }
        }
        System.out.println("the new arrays after addition is"+Arrays.deepToString(arr2));
    }
}
