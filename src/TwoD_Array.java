
public class TwoD_Array {
    public static void main(String[] args) {
        int d[][] = {
                        {1, 2, 3},
                        {3, 5, 7},
                        {5, 6, 7}
                    };

        for (int i = 0; i < d.length; i ++) {
            for (int j = 0; j < d[i].length; j ++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
