/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import javafx.util.converter.PercentageStringConverter;

/**
 *
 * @author juancho
 */
public class Main {
    
    public static void main(String[] args) {
        
        Address addrs = new Address("CR");
        Person p1 = new Person("111111111", "Jose", addrs);
        Person p2 = new Person("Maria");
        Person p3 = p1;
        
        System.out.println("Nombre comun estatico: " + Person.commonName + ". primera iteracion.");
        Person.commonName = "Karina";
        System.out.println("Nombre comun estatico: " + Person.commonName + ". segunda iteracion.");
        System.out.println();
        
        System.out.println("Nombre p1: " + p1.getName());
        System.out.println("Nombre p2: " + p2.getName());
        System.out.println("Nombre p3: " + p3.getName() + ". primera iteracion.");
        System.out.println();
        
        p1 = null;
        p3.setId("207020324");
        p3.setName("Juan");
        
        System.out.println("Nombre p3: " + p3.getName() + ". segunda iteracion.");
        System.out.println("Referencia p1: " + p1);
        System.out.println("Referencia p2: " + p2);
        System.out.println("Referencia p3: " + p3);
        System.out.println();
        
        System.out.println("Direccion (address) de p3: " + p3.getAddress().getAddress());
        p3.setAddress(new Address("AA", "AA", "AA", "AA"));
        System.out.println("Direccion (address) de p3: " + p3.getAddress().getAddress());
        System.out.println();
        
        System.out.println("Referencia p3 antes de passByValue: " + p3);
        int value = 5;
        System.out.println("Valor primitivo antes de valor passbyValue: " + value);
        System.out.println();
        int retorno = Person.passByValue(p3, value);
        
        System.out.println();
        System.out.println("Referencia p3 despues de passByValue: " + p3);
        System.out.println("Nombre p3 luego passByValue: " + p3.getName());
        System.out.println("Valor primitivo después de valor passbyValue: " + value);
        value = retorno;
        
        System.out.println();
        System.out.println("Cambia variable value: " + value);
        System.out.println();
        
        TestStatic tst = new TestStatic();
        tst.method2();
        TestStatic.value = 11;
        //System.out.println("Direccion (objeto) de p1: " + p1.getAddress().getAddress());
    }
    
}
