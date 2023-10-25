class A1 {
    public void show() {
        System.out.println("In A1");
    }
}

class B1 extends A1{
    public void show() {
        System.out.println("In B");
    }
    public void Config() {
        System.out.println("Config");
    }
}

class C1 extends A1{
    public void show() {
        System.out.println("In C");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A1 obj = new B1();   // runtime polymorphism
        obj.show();
        obj = new C1();
        obj.show();     //Dynamic Method Dispatch
    }
}
