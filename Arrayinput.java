
import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects");

        int size= s.nextInt();

       // int[] marks=new int[size];

        System.out.println("Enter the marks of the subjects ");
        int[] marks=new int[size];

        for(int i=0;i<size;i++){
           marks[i]= s.nextInt();
        }
         for(int i=0;i>size;i++){
            System.out.println("Marks="+marks[i]);
    }
     
    
}}
