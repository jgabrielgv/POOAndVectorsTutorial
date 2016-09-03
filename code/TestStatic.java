/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

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
        value = 4;
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
