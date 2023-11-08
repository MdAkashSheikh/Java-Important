class Calc1 {
    int num1;
    int num2;
    int result;
    public int perform(int extra, int prod) {
        result = (num1 + num2 + extra)*prod;
        if(result > 50) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
public class constractorDemo {
    public static void main(String[] args) {
        Calc1 obj = new Calc1();
        obj.num1 = 10;
        obj.num2 = 5;
        int k = obj.perform(4, 5);
        System.out.println(k);
    }
}
