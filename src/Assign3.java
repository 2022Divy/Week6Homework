public class Assign3 {
    //3. Write a Java programme using the following steps.
    //3.1 Declare one instance and one static variable.
    //3.2 Declare one instance method.
    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statement.
    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.


    int num = 75;
    static String Subject ="Account";

    public static void main(String[] args) {
        Assign3 s = new Assign3();
        s.sub();
        marks();

    }

    public void sub(){
        System.out.println("The number is :" +num);
        System.out.println("The Subject is:" +Subject);

    }

    public static void marks(){
        Assign3 vdp = new Assign3();
        System.out.println("The number is :" +vdp.num);
        System.out.println("The Subject is :" +Subject);


    }
}
