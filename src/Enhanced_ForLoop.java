public class Enhanced_ForLoop {
    public static void main(String[] args) {
        int a[] = {4, 8, 12, 16};
        int d[][] =
                {
                        {5, 6, 7, 8},
                        {8, 10, 7},
                        {2, 3, 6, 4, 9}
                };

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        for (int k : a) {
            System.out.print(k + " ");
        }

        for (int k[] : d) {
            System.out.println("");
            for (int l : k) {
                System.out.print(l + " ");
            }

        }
    }
}
