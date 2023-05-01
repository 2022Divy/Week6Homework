public class assign14 {
    //14. Write a Java program to print the sum (addition), multiply, subtract, divide and
    //remainder of two numbers.
    //Test Data:
    //Input first number: 125
    //Input second number: 24
    //Expected Output:
    //125 + 24 = 149
    //125 - 24 = 101
    //125 x 24 = 3000
    //125 / 24 = 5
    //125 mod 24 = 5

    static int a = 125, b = 24;

    public static void add(){
        System.out.println(" "+a +" + " +b+" = "+(a+b));
    }

    public static void sub(){
        System.out.println(" "+a +" - " +b+" = "+(a-b));
    }

    public static void multi(){
        System.out.println(" "+a +" * " +b+" = "+(a*b));
    }

    public static void div(){
        System.out.println(" "+a +" / " +b+" = "+(a/b));
    }

    public static void mod(){
        System.out.println(" "+a +" mod " +b+" = "+(a % b));
    }

    public static void main(String[] args) {
        add();
        sub();
        multi();
        div();
        mod();
    }
}
