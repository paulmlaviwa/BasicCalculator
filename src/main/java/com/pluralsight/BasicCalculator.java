package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = myScanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option: ");
        String action = myScanner.nextLine();

        System.out.println(num1 + " * " + num2 + " = " + num1*num2);
    }

}
