class Test3 {
    int num1;
    int num2;
    public Test3() {
        num1 = 5;
        num2 = 10;
        System.out.println("In First Constractor");
    }
    public Test3(int k) {
        num1 = k;
        num2 = k;
        System.out.println("In Second Constractor");
    }
    public Test3(double d) {
        num1 = (int) d;
        num2 = (int) d;
        System.out.println("In Third Constractor");
    }
}
public class constractorOverload {
    public static void main(String[] args) {
        Test3 obj = new Test3(5.2);
        System.out.println(obj.num1);
    }
}
