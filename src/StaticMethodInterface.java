interface Demo {
    int num = 8;
    void abc();
    static void show() {
        System.out.println("Hi this is Demo");
    }
}
class DemoImp implements Demo {
    public void abc() {
        System.out.println("");
    }
}
public class StaticMethodInterface {
    public static void main(String[] args) {
        Demo.show();
    }
}
