public class Arrayforeac {
    public static void main(String[] args) {
        
        int[] array={10,40,70,90};

        // by using for each loop ;

        for( int value:array){
            System.out.print(value+" , ");
        }

        //BY using for loop 
        
        for (int i=0;i<=3;i++){
            System.out.print(array[i]+",");
        }
    }
}
