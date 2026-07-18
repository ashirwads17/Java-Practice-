public class checkprimenew {
    public static void main(String[]args){
           int num = 14;
        int i;

        for( i = 2; i < num; i++) {

            if(num % i == 0) {
                System.out.println("Not Prime");
                break;
            }
        }

        if(i == num) {
            System.out.println("Prime");
        }
    }
}