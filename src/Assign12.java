public class Assign12 {
    //12. Write a Java program that takes three numbers as input to calculate and print the
    //average of the numbers.

    double m;

    public static void main(String[] args) {

        Assign12 a = new Assign12();
        a.div(15,20,25);

    }

    public void div(int x, int y, int z){

        m = (x+y+z)/3;

        System.out.println(" Average of 3 number is :" +m);

    }
}
