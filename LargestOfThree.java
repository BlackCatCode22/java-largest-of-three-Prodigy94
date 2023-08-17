


import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Largest of Three program! \n\n");


        // Variable Declaration Section
        String userName = "";

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int total = 0;
        int largest = 0;

        //Create a scanner object
        Scanner scanner = new Scanner(System.in);


        // use the scanner object to get the user's name
        // prompt the user for username
        System.out.println("\n Please enter your name: ");
        // Store userName into the variable named 'username'
        userName = scanner.nextLine();

        // Output user Name

        System.out.println("\n The username is: " + userName);

        // Get the three ints from the user:
        // Prompt for the first int
        System.out.println("Enter number one: ");
        num1 = scanner.nextInt();
        // out num1 ...
        System.out.println("\n You entered: " + num1 + " for the first number.");

        // Prompt for the second int
        System.out.println("Enter number two: ");
        num2 = scanner.nextInt();
        // out num2 ...
        System.out.println("\n You entered: " + num2 + " for the second number.");

        // Prompt for the third int
        System.out.println("Enter number three: ");
        num3 = scanner.nextInt();
        // out num3 ...
        System.out.println("\n You entered: " + num3 + " for the third number.");

        System.out.println("\n You entered: " + num1 + " and " + num2 + " and " + num3);


        // This is a statement to find the largest
        if (num1 > num2 & num1 > num3){
            largest = num1;
        }

        if (num2 > num1 & num2 >num3){
            largest = num2;
        }

        if (num3 > num1 & num3 > num2){
            largest = num3;
        }

        // output the largest number
        System.out.println("\n The largest of " + num1 + " and " + num2 + " and " + num3 + " is : " + largest);



    }


}