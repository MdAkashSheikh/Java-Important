public class wrapperClasses {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(i); //Boxing -> Wrapping

        int j = ii.intValue();  //Unboxing -> Unwrapping

        Integer value = i; //Auto Boxing
        int k = value;  //Auto Unboxing
        System.out.println(j);

        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);

    }
}
