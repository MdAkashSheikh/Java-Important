import java.util.Scanner;

public class Stones_on_the_Table_266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j, sum = 0;
        char[] a = sc.next().toCharArray();

        for (i = 0, j = 1; j<n; i++, j++) {
            if(a[i] == a[j]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
