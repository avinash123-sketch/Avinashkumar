public class largest{
    public static int getLargest(int numbers[]){
        int n = numbers.length;
        int largest = Integer.MIN_VALUE;
for (int i = 0; i < n; i++) {
    if(largest < numbers[i]){
        largest = numbers[i];
    }
} 
return largest;
    
    
}
public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10};
    System.out.println("the largest is " + getLargest(numbers));
}
    }
