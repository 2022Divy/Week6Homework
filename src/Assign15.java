public class Assign15 {
    //15. Write a Java program to convert a given string into lowercase.
    //Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
    //Output: the quick brown fox jumps over the lazy dog.


    static String a = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.", b;

    public static void conv(){
        b=a.toLowerCase();
        System.out.println(b);

    }

    public static void main(String[] args) {

        conv();

    }
}
