package com.akash;

class DemoClass {
    public void show() {
        System.out.println("This is DemoClass");
    }
}
class DemoClass2 extends DemoClass {

    public void show() {
        System.out.println("Hello This is another");
    }
}
public class TwoD_Array {
    public static void main(String[] args) {
        System.out.println("This is TwoD Array");
        DemoClass obj = new DemoClass2();

        obj.show();


    }
}
