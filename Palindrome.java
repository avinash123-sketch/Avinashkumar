public class Palindrome {
    public static void main(String[] args) {

        int rev = 0;
        int num = 121;
        int ori = num;

        while(num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(ori == rev) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}