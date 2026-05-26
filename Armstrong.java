public class Armstrong{
    public static void main(String[] args) {
        int num = 153;
        int ori = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
        sum = sum + (digit * digit * digit);
        num = num / 10;
        }
        if(sum == ori){
            System.out.println("Armstrong no");
        }else{
            System.out.println("not Armstrong");
        }
    }
}