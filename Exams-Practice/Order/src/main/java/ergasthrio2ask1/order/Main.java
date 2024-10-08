
package ergasthrio2ask1.order;


public class Main {
    public static void main(String[] args) {

        // Initialize an Order object
        Order order = new Order(0.0f);
        
        // Add order details
        System.out.println("Enter Product SKU (CPU1, CPU2, CPU3): ");
        String productSKU = UserInput.getString();

        System.out.println("Enter amount: ");
        float amount = UserInput.getFloat();

        System.out.println("Enter position (0, 1, 2): ");
        int pos = UserInput.getInteger();

        order.AddOrderDetails(productSKU, amount, pos);

        // Display the order details
        System.out.println(order.toString());
        
    }
}



