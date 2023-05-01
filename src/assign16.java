public class assign16 {

    //16. Write a Java Program to print as below. (All details to be stored in variable)
    //
    //"+------------------------+"
    //"| |"
    //"| CORNER STORE |"
    //"| |"
    //"| 2015-03-29 04:38PM |"
    //"| |"
    //"| Gallons: 10.870 |"
    //"| Price/gallon: $ 2.89 |"
    //"| |"
    //"| Fuel total: $ 22.71 |"
    //"| |"
    //"+------------------------+"

    String a = "CORNER STORE", Date = "2015-03-29",Time = "04:38PM",
            b = "Gallons:", c = "Price/gallon: $", d = "Fuel total: $";
    double num = 10.870d, num1 = 2.89d, num2 = 22.71;


    public static void main(String[] args) {
        assign16 v = new assign16();
        v.draw();

    }

    public void draw(){


        System.out.println("  ''+------------------------+''  ");
        System.out.println("  ''|                        |''  ");
        System.out.println("  ''|   "+a+"         |''  ");
        System.out.println("  ''|                        |''  ");
        System.out.println("  ''|  "+Date+" "+Time+"    |''  ");
        System.out.println("  ''|                        |''  ");
        System.out.println("  ''|  "+b+" "+num+"        |''  ");
        System.out.println("  ''|  "+c+"  "+num1+" |''  ");
        System.out.println("  ''|                        |''  ");
        System.out.println("  ''|  "+d+"  "+num2+"  |''  ");
        System.out.println("  ''|                        |''  ");
        System.out.println("  ''+------------------------+''  ");

    }
}
