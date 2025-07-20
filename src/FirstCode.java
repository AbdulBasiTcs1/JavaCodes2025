import java.util.Scanner;

/*
         --Introduction to JAVA
      1. What is Code ?
      2.
      3.
      4.
      5.
      6.
      7.
      8.
      9.
      10.
      11.
      12.

----(The Flowchart)----

       start
         |
input num 1 and num 2
         |
add the num1 and num2
         |
    print sum
         |
        stop

----(PseudoCode)-----

1.Start
2.Get 2 numbers from the user
3.Add both the numbers num1 and num2
4.print the sum of both of the numbers
5.Stop


----Simple JDK Installation
----CDE environment (vs,intellij idea etc...)

**/
public class FirstCode {
    public static void main(String[] args) {
        //----------------------output 3 methods--------------------------
        System.out.print("Hello World I am Printing without giving next line space");
        System.out.print("You saw no gap b/w them");

        System.out.println("\n");

        System.out.println("Hello World! I am devil not a newbie :)");
        System.out.println("Now gap applied");

        System.out.println("\n");

        System.out.print("Seperating and giving space\nby using\nthis slash n");

        // Practice to make a triangle of steriks
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("******");

        //-------------------------Variables :---------------------------
        //Primitive data types
        String name = "Abdul Basit";
        double cgpa = 3.93;
        int age = 21;
        byte rank = 3;
        short firstDigit = 3;
        boolean stillStudent = true;
        long phoneNumber = 474288135;
        float ageInShort = 20;  // idk ?
        //Non-primitive data types
        //  -->:
        //  String,Array,Class,Object,Interface

        //-----------------------------Input-----------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String namee = scanner.nextLine();
        System.out.println("Your name: "+namee);
        System.out.println("\n");
        System.out.println("Enter your age: ");
        int agee = scanner.nextInt();
        System.out.println("Your age: "+agee);
        System.out.println("\n");
        System.out.println("Enter your cgpa: ");
        double cgpaa = scanner.nextDouble();
        System.out.println("Your CGPA: "+cgpaa);





    }
}
