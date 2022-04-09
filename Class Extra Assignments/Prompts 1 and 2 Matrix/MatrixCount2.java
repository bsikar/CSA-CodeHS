public class MatrixCount2 {
    public static void main(String[] args) {
        char[][] matrix = new char[20][20];
        Matrix.randomFill(matrix);
        
        Matrix.printMatrix(matrix);
        Matrix.printHowMany(matrix, '7');
    }
}