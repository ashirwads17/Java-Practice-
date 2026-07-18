public class digits {
    public static void main(String[] args) {           // W.A.P TO PRINT DIGITS OF A NUMBBER AND COUNT THE NUMBER AS WELL
        
        int num=123;// int count=0;

        while(num>0)
        {
            System.out.println(num%10);
            num=num/10;
            //count++;
            
        }
        //System.out.println("number of digits = " +count);
    }
    
}
