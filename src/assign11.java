public class assign11 {
    //11. Write a Java program to compute the specified expressions and print the output.
    //Test Data:
    //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    //Expected Output: 2.138888888888889

    public static void main(String[] args) {

        put();

    }

    public static void put(){
        double a = 25.5d, b = 3.5d, c = 40.5d, d = 4.5d;

        System.out.println(" Expected output " +(a*b-b*b)/(c-d));

    }
}
