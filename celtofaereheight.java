import java.util.*;
public class celtofaereheight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float c = sc.nextFloat();
           float fahrenheit = (c * 1.8f) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();


    }
}
