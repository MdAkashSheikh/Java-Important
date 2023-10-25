import java.util.Scanner;

public class Way_Too_Long_Words_71A {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        int n = mySc.nextInt();

        while (n>=0) {

            String myString = mySc.nextLine();

//        System.out.println(myString.charAt());

            if(myString.length() >10) {
                int len = myString.length() - 2;
                System.out.print(myString.charAt(0));
                System.out.print(len);
                System.out.println(myString.charAt(len+1));

            } else {
                System.out.println(myString);
            }
            n--;
        }
    }
}
