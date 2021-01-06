import java.util.Scanner;

public class practice2_6 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();
        
        // Extract the first number
        int remFirst = number % 10;
        int holder = (number - remFirst)/10;
        
        // Extract the second number
        int remSecond = holder % 10;
        holder = (holder - remSecond)/10;
        
        // Remaining value is the third number.  Assign it a logical name.
        int remThird = holder;
        
        int product = remFirst * remSecond * remThird;
        
        System.out.println("The product of the digits in " + number + " is " + product + ".");
    }
    
}
