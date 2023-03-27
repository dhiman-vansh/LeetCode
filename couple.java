public class couple {
    public static void main(String[] args) {
        int[][] s1 = new int[5][5];
        int[][] s2 = new int[5][5];
        int[][] s3 = new int[15][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0) {
                    s1[i][j] = 0;
                    s2[i][j] = 1;
                } else {
                    s1[i][j] = 1;
                    s2[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0) {
                    s3[i][j] = 0;
                } else {
                    s3[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(s1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("S2 is -");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(s2[i][j]);
            }
            System.out.println("");
        }
    }
}
