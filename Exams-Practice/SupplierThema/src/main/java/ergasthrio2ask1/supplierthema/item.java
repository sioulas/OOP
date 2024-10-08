/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.supplierthema;

/**
 *
 * @author User
 */
public class item extends inventoryintem {

    double lotPrice;

    public item(int id, int stockQuantity, double lotPrice) {
        super(id, stockQuantity);
        this.lotPrice = lotPrice;
    }
}

