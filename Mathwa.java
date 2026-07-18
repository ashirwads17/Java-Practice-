import java.util.Scanner;

public class Mathwa {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);
        double sqrt = Math.sqrt(num);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Square Root: " + sqrt);
    }
    
}
