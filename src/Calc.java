public class Calc {
    public static void main(String[] args) {
        int Principal=5000;
        int Time= 2;
        int Rate=10;
        float SI=(Principal*Time*Rate)/100;
        System.out.println("The Simple Interest is\t"+"Rs."+SI);


        // Area of Triangle
        int base=10;
        int height=5;
        float Area=(base*height)/2;
        System.out.println("The Area of Triangle is\t"+Area);

        // Volume of Cube and Cuboid
        int length=5;
        int breadth=6;
        int height1=7;
        float VolCube=length*length*length;
        float VolCuboid=length*breadth*height1;
        System.out.println("The Volume of Cube is\t"+VolCube);
        System.out.println("The Volume of Cuboid is\t"+VolCuboid);

    }
}
