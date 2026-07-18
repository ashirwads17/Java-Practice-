public class Primeswhille {
    public static void main(String[] args) {
        int num=9;
        int i=1;
        int count=0;

        while(i<=num){
            if(num%i==0){
                count++;
            }
            i++;
        }
            if(count==2){
                System.out.println("This is  a Prime Number");
                
            }
            else{
                System.out.println("This is not a Prime Number");
                
            }
        }
    }

