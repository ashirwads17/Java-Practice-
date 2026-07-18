import java.util.Scanner;
public class calculatoor {
    public static void main(String[] args) {
        
        int a,b,c,ch;

        System.out.println("Enter any two number");

        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
    

        System.out.println("Enter your Choice");
        ch=s.nextInt();

        switch(ch)
        {
            case 1:
            c=a+b;
            System.out.println("addition"+c);
             break;

               case 2:
               c=a-b;
               System.out.println("subtraction"+c);
                break;

               default:
               System.out.println("Invalid choice");
        }
    }
    
}
