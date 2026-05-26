public class vowel {

    // isVowel function
    public static boolean isVowel(char ch) {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            return true;
        }


        return false;
    }

    public static void main(String[] args) {

        char ch = 'A';

        if(isVowel(ch)) {
            System.out.println("Vowel");
        } 
        else {
            System.out.println("Not Vowel");
        }
    }
}