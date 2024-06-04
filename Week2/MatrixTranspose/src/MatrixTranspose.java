public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        int newColumn = matrix.length;
        int newRow = matrix[0].length;
        int[][] transpose = new int[newRow][newColumn];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix [i][j];
            }
        }
        for(int[] col:matrix) {
            for (int row : col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println("*************************");

        for (int[] col : transpose) {
            for(int row: col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
