import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        

        Scanner reader = new Scanner(System.in);

    	// the program doesn't specify double or int. I will use double to be more thorough

    	double addends1;
    	double addends2;

    	System.out.print("What is your first number to add? ");
    	addends1 = Double.parseDouble(reader.nextLine());

    	System.out.print("What is your second number to add? ");
    	addends2 = Double.parseDouble(reader.nextLine());



    	double sum = addends1 + addends2;

    	System.out.println(sum);



    }
}
