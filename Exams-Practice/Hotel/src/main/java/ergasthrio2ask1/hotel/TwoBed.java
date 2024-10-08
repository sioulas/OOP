/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.hotel;

/**
 *
 * @author User
 */
public class TwoBed extends Room {
    private int floor;
    public TwoBed() {
        // Default constructor
        super(80);
    }   
    public TwoBed(int new_roomNumber, int new_rentDays, int new_floor) {
        // Semi constructor
        super(new_roomNumber, new_rentDays);
        this.setNightCharge(80);
        this.floor = new_floor;
    }
    public TwoBed(int new_roomNumber, double new_nightCharge, int new_rentDays, int new_floor) {
        // Full constructor
        super(new_roomNumber, new_rentDays);
        this.setNightCharge(new_nightCharge);
        this.floor = new_floor;
    }
    // Set-Get methods
    public void setFloor(int new_floor) {
        this.floor = new_floor;
    }
    public int getFloor() {
        return this.floor;
    }
    // toString method
    public String toString() {
        return super.toString() + ", Floor: " + this.floor;
    }
}
