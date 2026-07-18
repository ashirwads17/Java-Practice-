public class ArraySwap {
    public static void main(String[]args){

        int[] array2={10,20,40,50};
        int temp=0;

       temp=array2[0];
        array2[0]=array2[3];
         array2[3]=temp;

       

        System.out.println("array2[0] ="+array2[0]);
        System.out.println("array2[3]=" +array2[3]);
    }
    
}
