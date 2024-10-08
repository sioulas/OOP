/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.supplierthema;

/**
 *
 * @author User
 */
public class product implements iProductInventory{
    int id;
    String productname;
    item[] items = new item[1000];

    public product(int id, String productname) {
        this.id = id;
        this.productname = productname;
    }

    @Override
    public double getInventoryValue() {
        return items[1].stockQuantity*items[1].lotPrice;
    }

}
