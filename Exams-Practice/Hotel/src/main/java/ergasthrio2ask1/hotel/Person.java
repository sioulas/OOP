/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.hotel;


public class Person {
    private String name;
    
    public Person() {
        // Default constructor
    }
    public Person(String new_staffsName) {
        // Full constructor
        this.name = new_staffsName;
    }
    public void startServing() {
        System.out.println(this.name + ": start serving.");
    }
    // Set-Get methods
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return this.name;
    }
    // toString method
    public String toString() {
        return "Staff's name: " + this.name;
    }
}
