public class MatrixCount1 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {6, 7, 1, 2, 5},
            {6, 7, 8, 9, 0},
            {5, 4, 3, 2, 1},
        };
        
        Matrix.printMatrix(matrix);
        Matrix.printHowMany(matrix, 7);
    }
}