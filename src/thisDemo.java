class Test5 {
    int num1;
    int num2;
    public Test5(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
public class thisDemo {
    public static void main(String[] args) {
        Test5 obj = new Test5(4,5);

        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
