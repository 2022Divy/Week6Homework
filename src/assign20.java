public class assign20 {
    //20. Write a Java Program using below steps.
    //20.1 Declare your Spain as static variable.
    //20.2 Declare your United Kingdom as instance variable.
    //20.3 Declare instance method name homeCountry()and call static variable.
    //20.4 Declare static method name holidays() and call instance variable
    //20.5 Call both methods in main method.

    static String c1 = "Spain";
    String c2 = "United Kingdom";

    public void homeCountry(){
        System.out.println("The country name is :" +c1);

    }

    public static void holidays(){
        assign20 a = new assign20();
        System.out.println("The country name is :" +a.c2);
    }

    public static void main(String[] args) {
        assign20 b = new assign20();
        b.homeCountry();
        holidays();

    }
}
