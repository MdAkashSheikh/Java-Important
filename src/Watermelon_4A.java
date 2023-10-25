import java.util.Scanner;

public class Watermelon_4A {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);

        int num = mySc.nextInt();

        if(num<=2) {
            System.out.println("No");
        } else if(num%2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
