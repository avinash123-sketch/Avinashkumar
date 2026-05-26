public class Whil{
    public static void main(String[] args) {
        
        int battery = 10;
        int count = 0;
        while(battery < 100){
            count++;
            battery += 10;
        }
        System.out.println(count);
    }
}