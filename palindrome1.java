public class palindrome1 {
    
     
    public static void main(String[] args) {

        int num = 111;
        int reverse = 0;

        reverse = reverse * 10 + 1;
        reverse = reverse * 10 + 1;
        reverse = reverse * 10 + 1;

        if(num == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

