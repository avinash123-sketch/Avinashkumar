import java.util.*;
public class Prime {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      
        boolean prime = true;

        for(int i = 2; i <= num - 1; i++) {

            if(num % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}