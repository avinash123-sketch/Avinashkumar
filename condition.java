import java.util.*;
public class condition{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if(age < 18){
            System.out.println("child");
        }
        else if(age >=18 && age < 40){
            System.out.println("Adult");
        }
        else if(age <= 40){
            System.out.println("Senior citizen");
        }
        else{
            System.out.println("Senior citizen");
        }
    }
}