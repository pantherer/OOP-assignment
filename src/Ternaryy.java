public class Ternaryy {
    public static void main(String[] args) {
        System.out.println("Marks And Percentage of Students");

        int Science=50;
        int Math= 40;
        int Social=45;
        int Account=49;
        float TotalMarks=Science+Math+Social+Account;
        System.out.println("The total marks obtained by this student is "+TotalMarks);
        float Percentage=TotalMarks/4;
        System.out.println("The total percentage of this Student is "+Percentage);
        String Grade;
        Grade=(Percentage>=70)?"First Class":
                ((Percentage>=59&&Percentage<70)?"Upper Second Class":
                        ((Percentage>=49&&Percentage<59)?"Second Class":
                                ((Percentage>=39&&Percentage<49)?"Third Class":
                                        "Failed")));
        System.out.println("Your Grade is: "+Grade);

    }
}
