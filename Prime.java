

 

 public class Prime {
    public static void main(String[] args) {

        int num = 9;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
 
    
/*public class Prime {
    public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=scan.nextInt();
        scan.close();
        
        for(int i=2; i<num; i++) {
            if(num%i==0){
                System.out.println("Not a prime no.");
                break;
                
            }
            else{
                System.out.println("prime no.");
                break;
            }
        }
    }}*/
