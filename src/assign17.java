public class assign17 {
    //17. Write a Java Program using below steps.
    //17.1 Declare your city as instance variables.
    //17.2 Declare your country as static variables.
    //17.3 Declare one instance method and call static variable in print statement
    //17.4 Declare static method and call instance variable in print Statement.
    //17.5 Call both user defined methods into main method.

    String city ="london";
    static String country = "UK";

    public void sub(){
        System.out.println("The country is (instance method) :" +country);
    }

    public static void multi(){
        assign17 v = new assign17();
        System.out.println("The city is (static method) :" +v.city);

    }

    public static void main(String[] args) {
        assign17 a = new assign17();
        a.sub();
        multi();
    }
}
