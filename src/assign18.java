public class assign18 {
    //18. Write a Java Program using below steps.
    //18.1 Declare your council name as static variables.
    //18.2 Declare your house number as instance variables.
    //18.3 Declare one instance method name borough() and call Static variable
    //18.4 Declare static method name address() and call instance variable
    //18.5 Call both user defined methods into main method.

    static String council = "Harrow";
    int a = 5;

    public void borough(){
        System.out.println("The council name is :" +council);

    }

    public static void address(){
        assign18 z = new assign18();
        System.out.println("The house number is :" +z.a);

    }

    public static void main(String[] args) {
        assign18 y = new assign18();
        y.borough();
        address();
    }
}
