public class assign19 {
    //19. Write a Java Program using below steps.
    //19.1 Declare one of your group member names as instance variable.
    //19.2 Declare one of your group member names as static variable.
    //19.3 Declare one instance method name with group name (e.g. selenium())and call both global
    //variables.
    //19.4 Declare static method name agile() and call both variable
    //19.5 Call both user defined methods into main method.
    //Note: Declare 1 local variables in all user defined method and main method and print in to statement

    String name = "Hiral";
    static String name1 ="Meet";

    public void selenium(){
        int p = 18;

        System.out.println("A group member name is :" +name);
        System.out.println("A group member name is :" +name1);
        System.out.println(" The number is :" +p);

    }

    public static void agile(){
        assign19 w = new assign19();
        int q = 20;
        System.out.println("A group member name is (static method) :" +w.name);
        System.out.println("A group member name is (static method) :" +name1);
        System.out.println(" The number is (static method) :" +q);


    }

    public static void main(String[] args) {
        int r = 22;
        assign19 x = new assign19();

        System.out.println("The number is :" +r);
        x.selenium();
        agile();
    }
}
