/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.hotel;

/**
 *
 * @author User
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwoBed twoBedRoom = new TwoBed(101, 1, 1);
        FourBed fourBedRoom = new FourBed(202, 2, 2, 2);
        Suite suite = new Suite(303, 3, 3, 3, "Panos");
        
        System.out.println("Two bed room\n" + twoBedRoom);
        System.out.println("Four bed room\n" + fourBedRoom);
        System.out.println("Suite\n" + suite);
        suite.startServing();
    }   
}
