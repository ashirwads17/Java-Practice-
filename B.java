
import jdk.swing.interop.DispatcherWrapper;

public class B {
    public static void main(String[] args) {
        A r = new A();
        Disp.r();
    }

    void show() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

public class A{
    int a;
    String b;
    boolean c;

    A() {
        a = 100;
        b = "ankit";
        c = true;
    }

    void Disp() {
        System.out.println(a + " " + b + " " + c);
    }
}
