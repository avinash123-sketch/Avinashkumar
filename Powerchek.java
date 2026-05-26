public class Powerchek{
    public static void main(String[] args) {
        int n = 8;
        int m = 2;
        
            while(n % m == 0){
                n = n / m;

            }
          
        if(n == 1){
            System.out.println("Power");
        }else{
            System.out.println("Not pOWER");
        }
        
}
}