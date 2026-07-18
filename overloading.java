public class overloading {

    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(10,10));
        System.out.println(add(2.5,1.5));
    }
    
}
