public class square{
    public static void main(String[] args) {
        int num1 = 12131;
        int sum = 0;
        while(num1 > 0){
            int digit = num1 % 10;
        sum = sum + (digit * digit);
        num1 = num1 / 10;
        }
        System.out.println(sum);
    }
}