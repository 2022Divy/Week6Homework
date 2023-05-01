public class Assign7 {

    //7. Write a program to insert any temperature value in degree Fahrenheit and convert
    //to degree Celsius ((F − 32) × 5/9 = 0°C).

    double m;
    int F = 12;

    public static void main(String[] args) {
        Assign7 a = new Assign7();
        a.degree();

    }

    public void degree (){

        m = ((F - 32) * 5/9);
        System.out.println("Temperature in degree celsius is :" +m +"c");

    }


}
