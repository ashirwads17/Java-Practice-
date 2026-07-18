public class Arrayswappingelements {
    public static void main(String[] args) {
        
        int[] array={10,20,30,40,50};

       int First=0;
       int Last=array.length-1;

        while(Last>First){

        int temp=array[First];
        array[First]=array[Last];
        array[Last]=temp;

        First++;
        Last-- ;
        }
        for(int value:array){
        System.out.print( value+" ,");
        }

        
    }
}
    


/*   public class Arrayswappingelements {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};

        int First = 0;
        int Last = array.length - 1;

        while (First < Last) {

            int temp = array[First];
            array[First] = array[Last];
            array[Last] = temp;

            break;   // Stop after one swap
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}*/