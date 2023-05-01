public class assign5 {

    //5. Write a program for a calculator with addition, subtraction, multiplication, and division
    //methods all with parameters and use string concatenation methods. (Note: Two static
    //and Two instance methods.)


    public static void main(String[] args) {

        assign5 z = new assign5();
        z.add(25,20);
        z.sub(50,60);
        multiple(5,6);
        div(55,5);


    }
    public void add(int a, int b){

        System.out.println("The addition of "+a +" and " +b +" is :" +(a+b));


    }

    public void sub(int e, int f){

        System.out.println("The subtraction of "+e +" and " +f +" is :" +(f-e));
    }

    public static void multiple(int m, int n){

        System.out.println("The multiplication of "+m +" and " +n +" is :" +(m*n));
    }

    public static void div(int y, int z){

        System.out.println("The division of "+z +" and " +z +" is :" +(y/z));
    }
}
