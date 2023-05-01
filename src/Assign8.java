public class Assign8 {
    //8. Write a program to insert any temperature value in degree Fahrenheit and convert
    //to degree Celsius ((F − 32) × 5/9 = 0°C).

    double m;


    public static void main(String[] args) {
        Assign8 b= new Assign8();
        b.cel(58);


    }

    public void cel(int F){

        m = ((F - 32) * 5/9);
        System.out.println("Temperature in degree celsius is :" +m +"c");

    }


}

