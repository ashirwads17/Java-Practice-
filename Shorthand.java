
import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
 
    int num1;
    int num2;
        
        Scanner scan=new Scanner(System.in);

       num1=scan.nextInt();
       num2=scan.nextInt();

        num1 += num2;
        System.out.println(num1);

         num1 +=num2;
        System.out.println(num1);

        num1 +=num2;
        System.out.println(num1);

    }
}
