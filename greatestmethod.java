public class greatestmethod {
    
    static int check(int a,int b){
        if(a>b){
            return a;
        }
            else{
                return b;
            }
        }

        public static void main(String[] args) {
            int result=check(10,15);
            System.out.println( "Greatest number = "+result );
        }
    }

