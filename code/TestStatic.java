/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juancho
 */
public class TestStatic {
 
    public static int value = 5;
    
    public static void method1() {
       value = 10;// es igual a TestStatic.value = 10;
    }
    
    public void method2(){
      this.value = 8;
      System.out.println("TestStatic.value method2: " + value);
      method2(value);
    }
    
    public void method2(int value){
        System.out.println("Copia method2(value): " + value);
        value = 4;
        System.out.println("Copia method2(value): " + value);
        System.out.println("Variable TestStatic.value: " + TestStatic.value);
        method1();
    }
    
    public static void method3() {
        TestStatic tst = new TestStatic();
        tst.method2();
    }
    
    public void method4()  {
        method2();
    }
    
}
