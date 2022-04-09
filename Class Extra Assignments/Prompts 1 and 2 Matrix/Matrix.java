public class Matrix {    
    public static void randomFill(char[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                int option = (int)(Math.random() * 3);

                if (option == 0) {
                    matrix[y][x] = (char)('0' + Math.random() * 10);
                } else if (option == 1) {
                    matrix[y][x] = (char)('a' + Math.random() * 26);
                } else {
                    matrix[y][x] = (char)('A' + Math.random() * 26);
                }
            }
        }
    }

    public static void printHowMany(int[][] matrix, int target) {
        int count = 0;
        
        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell == target) {
                    count += 1;
                }
            }
        }

        System.out.println("The number of times " + target + " appers is -> " + count);
    }

    public static void printHowMany(char[][] matrix, char target) {
        int count = 0;
        
        for (char[] row : matrix) {
            for (char cell : row) {
                if (cell == target) {
                    count += 1;
                }
            }
        }

        System.out.println("The number of times " + target + " appers is -> " + count);
    }
    
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix Values:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    public static void printMatrix(char[][] matrix) {
        System.out.println("Matrix Values:");
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}