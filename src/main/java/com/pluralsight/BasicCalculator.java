package com.pluralsight;
import java.util.*;

public class BasicCalculator {public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int num1 = myScanner.nextInt();

    System.out.print("Enter number 2: ");
    int num2 = myScanner.nextInt();

    myScanner.nextLine();
    System.out.print("(A)dd (S)ubtract (M)ultiply (D)ivide: ");
    String possible_calculation = myScanner.nextLine();
    switch (possible_calculation){
        case "A":
            System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
            break;

        case "S":
            System.out.print(num1 + "-" + num2 + "=" + (num1 - num2));
            break;

        case "M":
            System.out.print(num1 + "*" + num2 + "=" + (num1 * num2));
            break;

        case "D":
            System.out.print(num1 + "/" + num2 + "=" + (num1 / num2));
            break;


    }

}

}
