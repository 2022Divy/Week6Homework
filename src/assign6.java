public class assign6 {

    //6. Write a program to enter any radius value of the circle and find out the area. (Formula
    //of Area A=PI*r*r).

    double PI = 3.14d;
    int r = 7;
    double z;

    public void add(){

        z = (PI*r*r);
        System.out.println("Area z=PI*r*r :" +z);
    }

    public static void main(String[] args) {
        assign6 a = new assign6();

        a.add();

    }
}
