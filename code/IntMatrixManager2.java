
public class IntMatrixManager2 {

    private int[][] matrix;
    private final int SIZE = 10;

    /**
     * a) IntMatrixManager(): constructor que inicializa la matriz atributo con
     * el atributo constante para filas y columnas.
     *
     */
    public IntMatrixManager2() {
        this.matrix = new int[SIZE][SIZE];
    }

    /**
     * *b) IntMatrixManager(int[][]): constructor que asigna el parámetro al
     * atributo matriz. En el caso de que el elemento recibido sea null,
     * inicializa de igual forma que el punto a).
     *
     * @param matrix
     */
    public IntMatrixManager2(int[][] matrix) {
        if (matrix == null) {
            this.matrix = new int[SIZE][SIZE];
        } else {
            this.matrix = matrix;
        }
    }

    public IntMatrixManager2(int rows, int columns) {
        this.matrix = new int[rows][columns];
    }

    public boolean rowAndColumnIndexValid(int rowIndex, int columnIndex) {
        return rowIndex >= 0 && rowIndex < matrix.length
                && columnIndex >= 0 && columnIndex < matrix[rowIndex].length;
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

    public boolean hasElements() {
        return matrix.length > 0 && matrix[0].length > 0;
    }

    //comando if en una linea: comparacion que hago ? entra la comparacion es true : entra aqui de lo contrario
    public void virus1(int countElements) {
        if (hasElements() && countElements <= (matrix.length * matrix[0].length)) {
            int rowIndex = (int) (countElements / matrix[0].length);
            int columnIndex = countElements - (rowIndex * matrix[0].length) - 1;
            if (rowIndex >= 0 && columnIndex >= -1) {
                for (int i = matrix.length - 1 - (rowIndex == matrix.length ? matrix.length - 1 : rowIndex); i < matrix.length; i++) {
                    for (int j = matrix[i].length - 1; j >= (i == (matrix.length - 1 - rowIndex) ? (matrix[i].length - 1 - columnIndex) : 0); j--) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }

    /**
     * @return
     */
    public boolean isSumAcumCol() {
        int sum;
        if (hasElements() && matrix[0].length > 1) {
            for (int i = 0; i < matrix.length; i++) {
                sum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j != matrix[i].length - 1) {
                        sum += matrix[i][j];
                    } else if (sum != matrix[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public boolean isLessThan(int[][] matrix) {
        if (hasElements()) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (this.matrix[i][j] >= matrix[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isHalfSumEqualHorizontal() {
        if (hasElements()) {
            int half = (int) (matrix.length * matrix[0].length % 2) == 0
                    ? (matrix.length * matrix[0].length) / 2 : (matrix.length * matrix[0].length - 1) / 2;

            int rowIndex = (int) (half / matrix[0].length);
            int columnIndex = half - (rowIndex * matrix[0].length);

            if (rowIndex >= 0 && columnIndex >= 0) {
                int sumFirstHalf = 0;
                int sumSecondHalf = 0;
                for (int i = 0; i <= rowIndex; i++) {
                    for (int j = 0; j < (i == rowIndex ? columnIndex : matrix[i].length); j++) {
                        sumFirstHalf += matrix[i][j];
                    }
                }
                for (int i = rowIndex; i < matrix.length; i++) {
                    for (int j = (i == rowIndex ? ((matrix.length % 2 != 0 ? matrix[i].length - columnIndex : 0)) : 0); j < matrix[i].length; j++) {
                        sumSecondHalf += matrix[i][j];
                    }
                }
                return sumFirstHalf == sumSecondHalf;
            }
        }
        return false;
    }

}
