public class Palindrome2 {
    
    static void palindro(int num){

    
          
        int original=num;
        int reverse=0;
       // int rem;
         

        while(num>0){                             //base condition - it is run until condition because true ;

       int rem=num%10;
        reverse=reverse*10+rem;
         
        num=num/10;
        }
        
        if(original==reverse){
            System.out.println(" This is a palindrome number");
        }
        else{
          System.out.println(" This is not  a palindrome number");  
        }
        }
    

    public static void main(String[]args){
         palindro(121);
    }
    }

