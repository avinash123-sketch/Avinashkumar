public class countdigit {

    // Function to count digits
    public static int countDigits(int n) {
int count = 0;



        while(n > 0){
            n = n / 10;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {

        int num = 12345;

        int result = countDigits(num);

        System.out.println("Total digits = " + result);
    }
}