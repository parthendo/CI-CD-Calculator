package MyCalculator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    private static final Logger logger = Logger.getLogger(Calculator.class);

    Calculator(){}

    public static void main(String args[]){

        System.out.println("*******************************");
        System.out.println("Welcome to Calculator on DevOps");
        System.out.println("*******************************");
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("Please choose for the options below");
            System.out.println("---------------------------");
            System.out.println("\tMenu:\nPress-\n1 to add two numbers\n2 to subtract two numbers"+
                    "\n3 to multiply two numbers\n4 to divide two numbers\n5 to quit");
            choice = scanner.nextInt();
            System.out.println("Enter two numbers");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            logger.info("Choice entered is " + choice);
            logger.info("Numbers entered are " + a + " " + b);
            switch (choice){
                case 1:
                    System.out.println("Addition result is: " + calculator.add(a,b));
                    break;
                /*case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;*/
                case 5:
                    logger.info("Program quit");
                    System.out.println("Program will quit");
                    break;
                default:
                    logger.info("Invalid Input");
                    System.out.println("Invalid Input");
                    break;

            }
        }while(choice!=5);

    }
    public static double add(double a,double b){
        logger.info("Method: Add");
        logger.info("Sum is " + (a+b));
        return a+b;
    }
}
