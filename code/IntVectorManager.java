/**
* Aporte de las compañeras
*/

public class IntVectorManager {
  private int[] vector; // creada, estructura de datos
  private final int SIZE = 10; 
  
  //3 Building
  public IntVectorManager(){
    vector = new int [SIZE];
  }
  
  public IntVectorManager(int... vector) {
    if (vector== null) {
      this.vector = new int [SIZE];
    }else {
      this.vector = vector;
    }
  }
  
  public IntVectorManager(int newSize) {
    if (newSize <= 0){
      vector = new int [SIZE];
    }else {
      vector = new int [newSize];
      
    }
    
  }
  
  public String getStringVector() {//Para recorrer 
    String txt = ""; //Para acceder a todos los elementos se hace con un for 
    int index = 0;
    for(int s: vector) {
      txt += s + " ";
    }
    
    return txt; 
    
  }
  
  public int getSize() {
    return vector.length; 
  }
  
  public void setElement(int element, int index) {
    if (index >=0 && index < vector.length) {
      vector[index] = element; //el elemento que recibo, lo igualo a la posici�n que recibo
    }
  }
  
  
  
  //Tarea hasta el 2
  //getElement(int): retorna el elemento que se encuentra en la posici�n recibida. 
  public int getElement(int index) {
    if (index >=0 && index < vector.length) {
      return vector[index]; //Saca del todo por eso se le podr�a quitar el else 
    }else {
      return -1; //ver el la prueba si esto funciona 
    }
  }
  
  
  //getFirst(): retorna el primer elemento del vector. 
  public  int getFirst() {
    return vector[0];
  }
  
  
  //getLast(): retorna el �ltimo elemento del vector. ---No es necesario validadr porque el usuario no ingresa
  public int getLast() {
    return vector[vector.length-1];
  }
  
  
  //searchElement(int): recorre el vector buscando el elemento recibido y retorna la posici�n en que se encuentra(la primer aparici�n en caso de repetidos). En caso de que no se encuentre retornar -1. 
  public int searchElement(int element) { //Busqueda secuencial
    for (int index = 0; index < vector.length; index++) {
      if (vector[index] == element) {
        return index; //tambi�n se puede hacer con un break, pero si se coloca m�s
      }
    }
    return -1; 
  }
  
  public boolean isHalfSumEqual1() { 
    int half = (vector.length -1)/2; 
    int sum1 = 0; 
    int sum2 = 0; 
    if(vector.length%2 == 0) { 
      for(int i = 0; i <= half; i++) { 
        sum1 += vector[i]; 
      } 
      for(int i = half + 1; i < vector.length; i++){ 
        sum2 += vector[i]; 
      } 
      if(sum1 == sum2) { 
        return true; 
      } else { 
        return false; 
      } 
    } else { 
      for(int i = 0; i < half; i++) { 
        sum1 += vector[i];  
      } 
      for(int i = half + 1; i < vector.length; i++) { 
        sum2 += vector[i]; 
      } 
      if (sum1 == sum2) { 
        return true; 
      } else { 
        return false; 
      } 
    } 
  }
  
  public boolean isHalfSumEqual2() { 
    
    int half = 0 ;
    if((vector.length % 2) == 0){
      half = vector.length / 2; 
    }else {
      half = (vector.length -1 ) /2;
    }
    
    int sum1 = 0; 
    int sum2 = 0; 
    
    for(int i = 0; i < half; i++) {
      sum1 += vector[i];
      sum2 += vector[vector.length - 1 - i];
    }
    
    return sum1 == sum2;
  }
  
}
