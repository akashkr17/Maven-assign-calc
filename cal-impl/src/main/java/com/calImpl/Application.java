package com.calImpl;
import java.util.Scanner;
import com.calApi.Calculator;
public class Application {
    public static void main(String[] args){
        int choice =0;
        int operand1 = 0;
        int operand2 = 0;

        //print the choices on the console
        System.out.println("Choose the operation('+', '-', '*', '/')");
        System.out.println(" Enter 1 for Addition");
        System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multiplication");
        System.out.println(" Enter 4 for Division");

        //statements to input choice
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice:\n");
        choice = in.nextInt();

        //perform checking for valid choice and get input from the user
        if(choice >= 1 && choice <= 4){
            in.nextLine();
            System.out.println("Enter First Number:\n");
            operand1 = in.nextInt();
            in.nextLine();
            System.out.println("Enter Second Number:\n");
            operand2 = in.nextInt();
        }
        else {
            System.out.println("You have entered wrong choice");
        }

        //create a new object cal of the class Calculator
        Calculator cal = new Calculator(operand1,operand2,choice);
        //Print the solution return by the object cal
        System.out.println("Result = " + cal.solution);


    }

}
