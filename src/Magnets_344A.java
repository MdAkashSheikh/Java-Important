import java.util.Scanner;

public class Magnets_344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = sc.next();
        int c = 0;
        for (int i = 1; i < n; i++) {
            String y = sc.next();
            if (x.charAt(1) == y.charAt(0)) {
                c++;
            }
            x = y;
        }
        System.out.println(c + 1);
    }
}
