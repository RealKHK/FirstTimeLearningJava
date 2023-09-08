package net.realkhk;

import java.util.Scanner;

public class Main {
    private static Object yes;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type in your user");
//        String input = scanner.nextLine();
//
//        System.out.println("Your username is: " + input);
//        System.out.println("Number of Words: " + input.length());

        // Declare = int x;
//        int x;
//        x = 10;
//        int y;
//        y = -20;
//
//        // Addition
//        int result;
//        result = x + y;
//        System.out.println(result);
//
//        // Subtraction
//        result = x - y;
//        System.out.println(result);
//
//        // Multiplication
//        result = x * y;
//        System.out.println(result);
//
//        // Division
//        result = y/x;
//        System.out.println(result);
//
//        // Remainder
//        result = 20 % 2;
//        System.out.println(result);
//
//        // Math methods
//        System.out.println(Math.abs(x+y));

        /* Assignment Operators */
//        int x = 100;
//        int y = 50;
//
//        x += y;
//        System.out.println(x);
//
//        x -= y;
//        System.out.println(x);
//
//        x *= y;
//        System.out.println(x);
//
//        x /= y;
//        System.out.println(x);
//
//        x %= y;
//        System.out.println(x);
//
//        x++;
//        System.out.println(x);
//
//        x++;
//        System.out.println(x);

        /* BOOLEAN and COMPARISON OPERATORS */

//        boolean I_love_you = true;
//        boo lean I_hate_you = false;
//
//        System.out.println("You have earned my heart "+ I_love_you);
//        System.out.println("You hate me " + I_hate_you);
//        Scanner scanner = new Scanner(System.in);
//
////        System.out.println("Do you hate me?");
////        String input = scanner.nextLine();
//
//        System.out.println(yes + ", Wrong answer");
//        System.out.println("Do you Love me?");
//        String input_2 = scanner.nextLine();
//
//        String no = "Wrong Answer!";
//        String yes= "Right Answer!";
//
//        System.out.println(input_2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you love me? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();

        boolean isLoved = response.equals("yes");

        if (isLoved) {
            System.out.println("Right Answer, I love you babe!");
        }else{
            System.out.println("WRONG ANSWER!");
        }

        scanner.close();






    }
}
