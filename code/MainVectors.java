/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author juancho
 */
public class MainVectors {
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int[] vector = { 1,2,9,18,1,3,8 };
    
    
    IntVectorManager mg = new IntVectorManager();
    mg = new IntVectorManager(vector);
    System.out.println(mg.getStringVector());
    mg.setElement(100, 200);
    
    System.out.println(mg.isHalfSumEqual1());
    System.out.println(mg.isHalfSumEqual2());
    
    System.out.println();
    iterate(new Person("Margorie"), new Person("dd"), new Person());
  }
  
  public static void iterate(Person... p) {
    for(Person temp: p) {
      System.out.println(temp.getName());//imprime nombre de persona
    }
    
    System.out.println();
    for (int i = 0; i < p.length; i++) {
      System.out.println(p[i]);//imprime referencia
    }
    
  }
  
}
