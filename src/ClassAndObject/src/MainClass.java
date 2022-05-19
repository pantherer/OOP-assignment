public class MainClass {
    public static void main(String[] args) {
        Car mazada = new Car(); // obj for a car
        mazada.name = "mazada";
        mazada.color = "green";
        mazada.manufacturedYear=2001;
        mazada.Drive();

        Car suzuki = new Car();// second obj
        suzuki.name = "suzuki";
        suzuki.color = "blue";
        suzuki.manufacturedYear=2003;
        suzuki.Drive();

        Car bmw = new Car();// Third object
        bmw.name = "BMW";
        bmw.color ="red";
        bmw.manufacturedYear=2010;
        bmw.Drive();

    }
}
