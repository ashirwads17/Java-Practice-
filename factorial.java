public class factorial {
    public static void main(String[] args) {
         
         int num=3; int facto=1;         // BY USING FOR LOOP;

        for(int i=1;i<=num;i++){
            facto=facto*i;
        }
            System.out.println(num+ "! =" +facto);
        
    }
    
}
    

   // By using While loop 
/*public class factorial {
    public static void main(String[] args) {
        int num=4;
        int facto=1;
        int i=1;

        while(i<=num){
            facto=facto*i;
            i++;
            
        }
        System.out.println("Factoria of 4 is "  +facto);
    }}
*/


