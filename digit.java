import java.util.Scanner;

public class digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = num; i > 0; i = i / 10) {
            sum = sum + (i % 10);
        }

        System.out.println("Sum of digits = " + sum);
    }
}