//import java.util.Arrays;
//public class Arrayspan {
   // public static void main(String[] args) {
        
       /*  int[] array={10,20,50,90,40};

Arrays.sort(array);
int max=array[array.length-1];
int min=array[0];

for(int value:array){
    System.out.print(value+" ,");
}
System.out.println();
int span=max-min;
System.out.println("Maximum"+max);
System.out.println("Minimum"+min);
System.out.println("SPAN = "+span);


}
}*/

import java.util.Arrays;

public class SpanArray {
    public static void main(String[] args) {

        int[] arr = {10, 40, 30, 20, 60};

        Arrays.sort(arr);

        System.out.println("Minimum = " + arr[0]);
        System.out.println("Maximum = " + arr[4]);
        System.out.println("Span "+arr[4-1]);
        ;
    }
}


