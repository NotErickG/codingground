import java.util.Scanner;

/*
Create a program that asks the user for two integers and prints their quotient. Make sure that 3 / 2 = 1.5. If the decimal part is missing, take another look at 6.1 Floating point numbers (decimal numbers) to find the solution.

Type a number: 3
Type another number: 2

Division: 3 / 2 = 1.5

        


*/



public class Divider {
    public static void main(String[] args) {
        

        Scanner reader = new Scanner(System.in);

    	// the program doesn't specify double or int. I will use double to be more thorough

    	double dividend;
    	double divisor;

    	System.out.print("What is number you would like to divide? ");
    	dividend = Double.parseDouble(reader.nextLine());

    	System.out.print("What is number you would like to divide by? ");
    	divisor = Double.parseDouble(reader.nextLine());



    	double quotient = dividend / divisor;

    	System.out.println(quotient);



    }
}
