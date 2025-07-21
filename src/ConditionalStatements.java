//-----------Conditional Statements-----------//
//         if, else, else-if, break, continue, switch

import java.util.Scanner;

public class ConditionalStatements {
    // Printing the age teller
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --------Age Tellers-------
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        if (age < 18){
//            System.out.println("You are not an adult");
//        }else if (age == 18){
//            System.out.println("You are teenager");
//        }else {
//            System.out.println("You are an adult");
//        }
//
//        //----------Even/Odd Tellers
//        System.out.println("____Want to Check Even and Odd?_____");
//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//        if (number % 2 == 0) {
//            System.out.println(number + " is Even");
//        } else {
//            System.out.println(number + " is Odd");
//
//        }
//
//        // Get number from the user and compare both of them
//        System.out.println("________Want to Compare 2 Numbers?________");
//        System.out.println("Provide first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Provide second number: ");
//        int num2 = sc.nextInt();
//        if(num1==num2){
//            System.out.println("Both numbers are equal");
//        } else if (num1>num2){
//            System.out.println(num1+" is greater than "+num2);
//        } else if (num2>num1){
//            System.out.println(num1+" is smaller than "+num2);
//        }else {
//            System.out.println("Both have some issues :)");
//        }

        //-----------Switch Statements--------
        System.out.println("Family member numbered as: ");
        int fmn = sc.nextInt();
        switch (fmn){
            case 1:
                System.out.println("Welcome: Gul Shereen Khan");
                break;
            case 2:
                System.out.println("Welcome: Nasreen Akhtar");
                break;
            case 3:
                System.out.println("Welcome: Shummaila Shereen");
                break;
            case 4:
                System.out.println("Welcome: Abdul Basit (The Coder)");
                break;
            case 5:
                System.out.println("Welcome: Abdul Fatir");
                break;
            default:
                System.out.println("You are not a member!");
        }

    }}
