class ABc {
    public int add(int ... n) {
        int sum = 0;
        for (int k : n) {
            sum += k;
        }
        return sum;
    }
}
public class VarArgs {
    public static void main(String[] args) {
        ABc obj = new ABc();
        System.out.println(obj.add(7, 9, 10, 5, 9));
    }
}
