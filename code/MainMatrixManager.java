
import java.util.Arrays;

public class MainMatrixManager {
  
  public static void main(String[] args) {
    
    int[][] matrix = {{1,2,3},{6,7,8,9},{11,12,13}};
    
    IntMatrixManager manager = new IntMatrixManager(matrix);
    System.out.println(manager.getStringMatrix());
    manager.add(0,0,50);
    //manager.remove(2, 0);
    System.out.println();
    System.out.println(manager.getStringMatrix());
    
    System.out.println();
    IntMatrixManager managerCopy = new IntMatrixManager(manager.clone());
    System.out.println(managerCopy.getStringMatrix());
  }
  
}