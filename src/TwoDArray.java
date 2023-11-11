public class TwoDArray {
    public static void main(String[] args) {
        int d[][] = {
                {2, 3, 4, 5},
                {3, 5, 6},
                {8, 9, 3, 4}
        };

        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d[i].length; j ++ ) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
