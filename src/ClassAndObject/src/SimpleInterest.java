public class SimpleInterest {
    float principle;
    float rate;
    float time;
    double interest;

    double calculation(float principle,float rate, double interest){
        interest = ((principle*time*rate)/100);
        return interest;
        //System.out.println("interest is"+interest);

    }
}
