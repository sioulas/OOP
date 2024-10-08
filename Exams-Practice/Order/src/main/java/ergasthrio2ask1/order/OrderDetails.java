/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergasthrio2ask1.order;

public class OrderDetails implements TransactionDetails {
    
    private String ProductSKU;
    private float amount;

    public OrderDetails() {
        this.ProductSKU = "";
        this.amount = 0;
    }

    public String getProductSKU() {
        return ProductSKU;
    }

    public void setProductSKU(String ProductSKU) {
        this.ProductSKU = ProductSKU;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    @Override
    public String getProductDetails(){
        if(this.ProductSKU.equals(ProductDetailsDB.ProductDetails[0][0])){
            return(ProductDetailsDB.ProductDetails[0][1]);
        }
        else if(this.ProductSKU.equals(ProductDetailsDB.ProductDetails[1][0])){
            return(ProductDetailsDB.ProductDetails[1][1]);
        }
        else{
            return(ProductDetailsDB.ProductDetails[2][1]);
        }    
    }
}
