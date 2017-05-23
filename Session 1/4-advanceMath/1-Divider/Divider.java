import java.util.Scanner;

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
