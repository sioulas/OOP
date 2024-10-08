/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.hotel;

/**
 *
 * @author User
 */
public class Suite extends FourBed {
    private Person staff;
    public Suite() {
        // Default constructor
        super();
        staff = new Person();
        this.setNightCharge(super.getNightCharge() + 200);
        System.out.println("Suite Default: " + this.getNightCharge());
    }       
    public Suite(String new_staffsName) {
        // Semi constructor
        super();
        staff = new Person(new_staffsName);
        this.setNightCharge(super.getNightCharge() + 200);
    }       
    public Suite(int new_roomNumber, int new_rentDays, int new_floor, int new_persons, String new_staffsName) {
        // Full constructor
        super(new_roomNumber, new_rentDays, new_floor, new_persons);
        staff = new Person(new_staffsName);
        this.setNightCharge(super.getNightCharge() + 200);
    }
    public void startServing() {
        System.out.println(this.staff.getName() + ": start serving.");
    }
    // Set-Get methods
    public void setStaffsName(String new_staffsName) {
        this.staff.setName(new_staffsName);
    }
    public String getStaffsName() {
        return this.staff.getName();
    }
    // toString method
    public String toString() {
        return super.toString() + ", Staff's name: " + this.staff.getName();
    }
}
