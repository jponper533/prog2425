public class App {
    public static void main(String[] args) throws Exception {
        int[][] a = new int[2][5];
        int[][] b = new int[5][2];

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < b[0].length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[j][i] + " ");
            }
            System.out.println();
        }
    }
}
