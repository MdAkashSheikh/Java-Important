public class EnhanceForLoop {
    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 8, 2, 6};

        int d[][] = {
                {2, 3, 4, 5},
                {3, 5, 6},
                {8, 9, 3, 4}
        };

        for(int k[] : d) {
            for(int l : k) {
                System.out.print(l + " ");
            }
            System.out.println("");
        }
    }
}
