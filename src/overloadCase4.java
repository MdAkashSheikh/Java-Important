class Test4 {
    public void m1(int i) {
        System.out.println("Simple int");
    }
    public void m1(int... i) {
        System.out.println("OK");
    }
}

public class overloadCase4 {
    public static void main(String[] args) {
        Test4 t = new Test4();
        t.m1(10);
        t.m1(10, 25, 30);
        t.m1();
    }
}
