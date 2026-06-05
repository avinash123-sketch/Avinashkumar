public class missingarr {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0; i <= nums.length; i++){
            sum+= i;

            }
            for(int i = 0; i < nums.length; i++){
                sum-=nums[i]; 
            }
            return sum;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,7,9};
            
        missingarr obj = new missingarr();
        System.out.println(obj.missingNumber(arr));
        }
    }

