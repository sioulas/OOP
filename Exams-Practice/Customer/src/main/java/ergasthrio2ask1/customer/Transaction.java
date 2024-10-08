/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.customer;

/**
 *
 * @author User
 */
abstract class Transaction {
    private int id;
    private String code;
    
    // Default constructor
    public Transaction() {}
    
    // Μέθοδοι get, set & toString
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "id= " + id + ", code= '" + code + '\'';
    }
}
