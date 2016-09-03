/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juancho
 */
public class Person {

    private String id;
    private String name;
    private Address address; 
    
    public static String commonName = "Juan";
    
    public Person() {
        
    }
    
    public Person(String name) {
        this.name = name;
    }

    public Person(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public static int passByValue(Person person, int value) {
        System.out.println("Variable primitiva valor: " + value + ". primera iteracion.");
        value = 8;
        System.out.println("Variable primitiva valor: " + value + ". segunda iteracion.");
        //this.setName(person.getName());
        person.setName("Damian");
        System.out.println("Direccion paso por valor 1: " + person + ". primera iteracion.");
        person = new Person("Felipe");
        System.out.println("Direccion paso por valor 2: " + person + ". segunda iteracion.");
        return value;
    }
 
}
