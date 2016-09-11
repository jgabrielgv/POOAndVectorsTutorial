
public class IntMatrixManager {

    private int[][] matrix;
    private final int SIZE = 10;

    /**
     * a) IntMatrixManager(): constructor que inicializa la matriz atributo con
     * el atributo constante para filas y columnas.
     *
     */
    public IntMatrixManager() {
        this.matrix = new int[SIZE][SIZE];
    }

    /**
     * *b) IntMatrixManager(int[][]): constructor que asigna el parámetro al
     * atributo matriz. En el caso de que el elemento recibido sea null,
     * inicializa de igual forma que el punto a).
     *
     */
    public IntMatrixManager(int[][] matrix) {
        if (matrix == null) {
            this.matrix = new int[SIZE][SIZE];
        } else {
            this.matrix = matrix;
        }
    }

    public IntMatrixManager(int rows, int columns) {
	if(rows >= 0 && columns >= 0) {
            this.matrix = new int[rows][columns];
	} else {
            this.matrix = new int[SIZE][SIZE];
	}
    }

    public String getStringMatrix() {
        String txt = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                txt += matrix[i][j] + " ";
            }
            if (i < matrix.length - 1) {
                txt += "\n";
            }
        }
        return txt;
    }

    public int getRowSize() {
        return matrix.length;
    }

    public int getColumnSize(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < matrix.length) {
            return matrix[rowIndex].length;
        }
        return -1;
    }

    public int getColumnSize() {
        return getColumnSize(0);
    }

    public boolean rowAndColumnIndexValid(int rowIndex, int columnIndex) {
        return rowIndex >= 0 && rowIndex < matrix.length
                && columnIndex >= 0 && columnIndex < matrix[rowIndex].length;
    }

    public void setElement(int rowIndex, int columnIndex, int element) {
        if (rowAndColumnIndexValid(rowIndex, columnIndex)) {
            matrix[rowIndex][columnIndex] = element;
        }
    }

    public int getElement(int rowIndex, int columnIndex) {
        if (rowAndColumnIndexValid(rowIndex, columnIndex)) {
            return matrix[rowIndex][columnIndex];
        }
        return -1;
    }

    public int[] searchElement(int element) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (element == matrix[i][j]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void add(int rowIndex, int columnIndex, int element) {
        if (rowAndColumnIndexValid(rowIndex, columnIndex)) {
            for (int i = matrix.length - 1; i >= rowIndex; i--) {
                for (int j = matrix[i].length - 1; j > (i == rowIndex ? columnIndex : 0); j--) {
                    matrix[i][j] = matrix[i][j - 1];
                }
                if (i > rowIndex) {
                    matrix[i][0] = matrix[i - 1][matrix[i - 1].length - 1];
                }
            }
            matrix[rowIndex][columnIndex] = element;
        }
    }

    //Monica
    public void add2(int row, int column, int element) {
        int c = 0;
        int r = 0;
        for (r = matrix.length - 1; r >= row; r--) {
            for (c = matrix[r].length - 1; ((r == row && c > column) || (c > 0)); c--) {
                matrix[r][c] = matrix[r][c - 1];
            }
            matrix[r][0] = matrix[r - 1][matrix[0].length - 1];
        }
        matrix[row][column] = element;
    }

    public int remove(int rowIndex, int columnIndex) {
        if (rowAndColumnIndexValid(rowIndex, columnIndex)) {
            int item = matrix[rowIndex][columnIndex];
            for (int i = rowIndex; i < matrix.length; i++) {
                for (int j = (i == rowIndex ? columnIndex : 0); j < matrix[i].length - 1; j++) {
                    matrix[i][j] = matrix[i][j + 1];
                }
                if (i != matrix.length - 1) {
                    matrix[i][matrix[i].length - 1] = matrix[i + 1][0];
                }
            }
            matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] = 0;
            return item;
        }
        return -1;
    }

    public int[][] clone() {
        if (matrix.length > 0 && matrix[0].length > 0) {
            int[][] copy = new int[matrix.length][];
            for (int i = 0; i < matrix.length; i++) {
                copy[i] = new int[matrix[i].length];//need to know the length in case it is an irregular matrix
                for (int j = 0; j < matrix[i].length; j++) {
                    copy[i][j] = matrix[i][j];
                }
            }
            return copy;
        }
        return new int[][]{};
    }

}
