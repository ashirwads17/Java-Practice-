public class namingconvention {
    public static void main(String[] args) {

        // for implicit castinng or widening casting 

        short sh = 123;          // byte -> short -> char -> int -> float -> double
        int intData = sh;        // we are doing implicit casting which is automatically it is short to int
        System.out.println(intData);

         int var = 123; // innt -> float me jaa rhe h hum
        float f1 = var;
       System.out.println(f1);
        
        char ch = 'A';
        int intNum = ch;
        System.out.println(intNum);

         

        // For explicit casting ; narrowing casting 

        int intMan = 258;
        short sh1 = (short) intMan; // int->short
        System.out.println(sh1);

        int boy=65;
        char ch3= (char) boy;
          System.out.println(ch3);


        int x = 68;
        char ch2 = (char) x; // int -> char
        System.out.println(ch2);

        int a= 255;
        byte b4=(byte) a;
        System.out.println(b4);

        byte b3=123;
        int d1= b3;
        System.out.println(d1);

        char d2='A';
        int s5=d2;
        System.out.println(s5);

        int z1=66;
        char ch4= (char) z1;
        System.out.println(ch4);


    }

}
