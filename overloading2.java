public class overloading2 {
    

    static void test(char a){
        System.out.println("char");
    }

    static void test(int a){
        System.out.println("int");
    }

    public static void main(String[] args) {
        test('A');
        test(20);
    }
}
    

