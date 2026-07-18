public class overloadinng1 {

    static int great(int a,int b){            // W.A.P to find the greatest number of using method  by 2 number or 3 number also 
          if(a>b){
            return a;
              }
           else{
            return b;
           }  
        } 

        static int great(int a,int b,int c){
            if(a>b && a>c){
                return a;
            }

            else if(b>c){
                return b;
            }
            else{
                return c;
            }
            
            
        }

           public static void main(String[]args){
            (great(5, 10));

             (great(5, 10,20));

           }
           
           }

