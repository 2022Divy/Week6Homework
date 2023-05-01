public class assign13 {
    //13. Write a Java program to print the area and perimeter of a rectangle.
    //Test Data:
    //
    //Width = 5.5 Height = 8.5
    //
    //Expected Output:
    //
    //Area is 5.6 * 8.5 = 47.60
    //Perimeter is 2 * (5.6 + 8.5) = 28.20

    static float a = 5.6f, b = 8.5f;

    public static void main(String[] args) {

        add();
        form();


    }

    public static void add(){
        System.out.println("Total area is :" +(a*b));

    }

    public static void form(){

        System.out.println("Total para is :" +(2*(a+b)));

    }
}
