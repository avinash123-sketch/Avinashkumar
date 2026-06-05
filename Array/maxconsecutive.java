public class maxconsecutive {
    public int maxConsecBits(int[] arr) {
       int maxcount = 1;
       int count = 1;
       for(int i = 1; i < arr.length; i++){
           if(arr[i] == arr[i-1]){
               count++;
           }else{
               maxcount = Math.max(maxcount, count);
                count = 1;
           }
       }
               return Math.max(maxcount, count);

        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxconsecutive obj = new maxconsecutive();
        System.out.println(obj.maxConsecBits(arr));
    }
}

           