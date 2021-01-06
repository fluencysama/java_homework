import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a degree in Farenheit: ");
        double farenheit = input.nextDouble();
        
        double celsius = (5.0/9)*(farenheit-32);
        System.out.println("Farenheit " + farenheit + " is " + celsius + " in Celsius");
    }
    
}
