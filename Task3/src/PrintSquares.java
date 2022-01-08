/**
 * Name: Jeffano John
 * Date: Saturday Nov. 13th 2021
 * Student #: 251230759
 * Description: Asks the user for a positive nonzero integer value N, print a sequence of all the squares of natural numbers that do not exceed N, in ascending order.
 */
import java.util.Scanner;

public class PrintSquares {
    public static void main(String[] args) {
        //Initializing the scanner class
        Scanner scanner = new Scanner(System.in);

        //Declaring a variable and assiging them values
        int input;
        int base = 1;
        int squared;
        String output = "";

        //Ask the user for a value
        System.out.println("Please enter a positive nonzero integer");

        //Using the scanner class to read the user input
        input = scanner.nextInt();

        do{
            //squares the values
            squared = base * base;
            //Adds a one to the base to check for the next square
            base++;

            //Checks if the last squared value is less than the inputted value. If yes, it is added to the final output. If No, then it breaks and prints the already stored values.
            if (squared < input){
                //Adds the squared values in a straight line
                output += squared + ", ";
            }
            else {
                break;
            }

        } while (squared < input);

        //Prints the line of squares before the user inputted value
        System.out.println(output);
    }
}
