/*
The exercise file initially contains a program which prints:

Chickens:
3
Bacon (kg):
5.5
A tractor:
There is none!

In a nutshell:
3
5.5
There is none!
        
Change the program in the specified places so that it will print:

Chickens:
9000
Bacon (kg):
0.1
A tractor:
Zetor

In a nutshell:
9000
0.1
Zetor



*/

public class HelloWorld {
    public static void main(String[] args) {
        
        int numberOfChickens = 3;
        double baconInKG = 5.5;
        String tractorType = "There is none!"        


        System.out.println("Chickens:");
        System.out.println(numberOfChickens);
        System.out.println("Bacon (kg):");
        System.out.println(baconInKG);
        System.out.println("A tractor:");
        System.out.println(tractorType);
        System.out.println();
        System.out.println("In a nutshell");
        System.out.println(numberOfChickens);
        System.out.println(baconInKG);
        System.out.println(tractorType);




    }
}
