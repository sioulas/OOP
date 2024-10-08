
package ergasthrio2ask1.supplierthema;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        supplier supplier = new supplier("jim");
        boolean loop = true;
        while(loop){

            System.out.println("Enter ID");
            int id=scanner.nextInt();
            if (id==0){break;}
            System.out.println("Enter name");
            String name=scanner.next();
            System.out.println("Enter price");
            float price=scanner.nextFloat();
            System.out.println("Enter quantity");
            int quantity=scanner.nextInt();

            supplier.AddPurchace(id, name, price, quantity);






        }
        for(int i = 0;i<supplier.Products.length;i++){
            if(supplier.Products[i] != null){
                System.out.println( supplier.Products[i].productname +" "+supplier.Products[i].items[1].stockQuantity +" "+ supplier.Products[i].getInventoryValue());
            }


        }


    }
}

