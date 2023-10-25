class Calc {
      public int add(int ...n) { // Variable length Arguments
          int sum = 0;

          for (int i : n) {
              sum += i;
          }
          return sum;
      }
}
public class varArgs {
    public static void main(String[] args) {
        Calc obj = new Calc();

        int a = obj.add(10, 9, 23);

        System.out.println(a);
    }
}
