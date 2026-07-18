
import java.util.Scanner;

public class Lovermaths {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter your name ");
           String myName= s.next();

            System.out.println("Enter your  lover name ");
             String loverName= s.next();

             int perct=(int)(Math.random()*100);             // typecasting hua h double ka value  int me dal rhe kyu ki percentage double value me aa skya h 
           
            // System.out.println("Your lover "+ loverName+ " " +perct+ "% loves"+ "to you" +myName);
             System.out.println(loverName + " loves you " + perct+ " % " +myName);

    }
    
}
