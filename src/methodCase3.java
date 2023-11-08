class Test2 {
    public void m1(String s) {
        System.out.println("String Version");
    }
    public void m1(StringBuffer sb) {
        System.out.println("StringBuffer Version");
    }
}

public class methodCase3 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.m1("Hello");
        t.m1(new StringBuffer("Hello"));
//        t.m1(null);

    }
}
