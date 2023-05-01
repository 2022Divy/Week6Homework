public class assign8 {
    //8. Write a program to insert any temperature value in degree Fahrenheit and convert
    //to degree Celsius ((F − 32) × 5/9 = 0°C).

    double m;


    public static void main(String[] args) {
        assign8 b= new assign8();
        b.cel(58);


    }

    public void cel(int F){

        m = ((F - 32) * 5/9);
        System.out.println("Temperature in degree celsius is :" +m +"c");

    }


}

