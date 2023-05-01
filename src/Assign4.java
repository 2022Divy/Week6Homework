public class Assign4 {
    //4. Write a Java programme using the following steps.
    //4.1 Declare two instance and two static variables.
    //4.2 Declare one instance method.
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.
    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.

    int num1 = 20,   num2 = 15;
    static String name = "Shweta", Surname = "Patel";

    public void num(){
        System.out.println("The number is :" +num1);
        System.out.println("The num is :" +num2);
        System.out.println("The name is :" +name);
        System.out.println("The name is :" +Surname);

    }

    public static void Bio(){
        Assign4 a = new Assign4();
        System.out.println("The number is :" +a.num1);
        System.out.println("The number is :" +a.num2);
        System.out.println("The name is :" +name);
        System.out.println("The Surname is :" +Surname);

        }

    public static void main(String[] args) {
        Assign4 p = new Assign4();
        p.num();
        Bio();

    }

    }

