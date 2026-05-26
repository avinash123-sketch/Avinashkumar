public class functeven{
    public static  int evensum(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
        if(i % 2 == 0){
            sum = sum + i;

        
        }

    }
    return sum;

}
public static void main(String[] args) {
    int result = evensum(1,10);
    System.out.println(result);
}
}
