class Test1 {
    public void m1(Object o) {
        System.out.println("Object Version");
    }
    public void m1(String s) {
        System.out.println("String Version");
    }
}
public class overDemo {
    public static void main(String[] args) {
        Test1 t = new Test1();

        t.m1(new Object());
        t.m1("Akash");
        t.m1(null);
    }
}
