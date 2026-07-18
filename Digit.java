 import java.util.Scanner;

/*public class Digit {
    public static void main(String[] args) {         // this is the program of print the digits of a number in reverse form 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            System.out.println(digit);
        }
        
      
    }
}  */

// this is the program of print the digits of a number 

public class Digit {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4 digit number: ");
        int num = sc.nextInt();
        count++;

        System.out.println(num / 1000);          // First digit
        System.out.println((num / 100) % 10);   // Second digit
        System.out.println((num / 10) % 10);    // Third digit
        System.out.println(num % 10);           // Last digit
         System.out.println("Count numbers=" +count);
    }
}
