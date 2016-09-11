public class MainMatrixManager2 {
  
  public static void main(String[] args) {
    
    //int[][] matrix = {{1,2,3,4,5},{5,5,14,6,4},{4,1,1,4,5}};
    //int[][] matrix = { {1, 2, 3}, {1, 2, 3} };
    //int[][] matrix = { {1, 2, 3}, {1, 2, 1}, {1, 2, 3} };
    //int[][] matrix = { {1, 2, 3, 4}, {4, 1, 1, 4}, {1, 2, 3, 4} };
    int[][] matrix = { {4, 4, 4, 4}, {4, 1, 1, 4}, {1, 2, 3, 4}, {4, 4, 4, 4} };
    //int[][] matrix = { {4}, {4}, {4}, {4} };
    
    IntMatrixManager2 manager = new IntMatrixManager2(matrix);
    //manager.virus1(9);
    System.out.println(manager.getStringMatrix());
    System.out.println();
    System.out.println(manager.isHalfSumEqualHorizontal());
    System.out.println();
    System.out.print(manager.isSumAcumCol());
    System.out.println();
  }
  
}