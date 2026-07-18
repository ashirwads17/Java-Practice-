import java.util.Scanner;

public class condition {
    
    public static void main(String[] args) {
        int pwd;

        System.out.println("Enter  any password");
       
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();

        if(pwd==2345)
        {
            System.out.println("Name=Ashirwad kumar  Srivastava");
            System.out.println("age=21");
 }
 else{
    System.out.println("ERROR");

 }
    }
    
}
    

