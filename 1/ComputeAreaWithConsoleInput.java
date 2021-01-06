import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * java.lang.Math.PI;
        
        System.out.println("The area for the circle fo radius " +
                radius + " is " + area);
    }
}
