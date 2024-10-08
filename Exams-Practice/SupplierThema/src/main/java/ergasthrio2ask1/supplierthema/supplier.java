/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.supplierthema;

/**
 *
 * @author User
 */
public class supplier {
    String name;
    product[] Products = new product[10];


    public void AddPurchace(int id,String name,float price,int quantity ){
        for(int i=0;i<Products.length;i++){
            if(Products[i]==null){
                Products[i]= new product(id,name);
                for(int j=0;j<quantity;j++){
                    Products[i].items[j] = new item(id,quantity,price);
                }
                i=Products.length;
            }
        }

    }

    public supplier(String name) {
        this.name = name;

    }

    public supplier() {

    }
}