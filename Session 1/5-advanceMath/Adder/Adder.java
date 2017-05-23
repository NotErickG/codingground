import java.util.Scanner;

/*
Create a program to calculate the sum of two numbers. At the beginning of the program two variables are introduced and those variables hold the numbers to be summed. Feel free to use other variables if you need to.

For example, if the variables hold numbers 5 and 4, the program should output:

5 + 4 = 9
        
If the variables hold numbers 73457 and 12888, the program output should be:

73457 + 12888 = 86345
        
        


*/



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
