package ergasthrio2ask1.order;

public class Order extends Transaction {
    private OrderDetails[] details;
    private float totalAmount;

    public OrderDetails[] getDetails() {
        return details;
    }

    public void setDetails(OrderDetails[] details) {
        this.details = details;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order(float totalAmount) {
        this.totalAmount = totalAmount;
        this.details = new OrderDetails[3];
        for (int i = 0; i < 3; i++) {
            this.details[i] = new OrderDetails();
        }
    }

    public void AddOrderDetails(String ProductSKU, float amount, int pos) {
        if (pos < 3) {
            try {
                if ((ProductSKU.equals(ProductDetailsDB.ProductDetails[0][0])) ||
                    (ProductSKU.equals(ProductDetailsDB.ProductDetails[1][0])) ||
                    (ProductSKU.equals(ProductDetailsDB.ProductDetails[2][0]))) {
                    
                    this.details[pos] = new OrderDetails();
                    this.details[pos].setProductSKU(ProductSKU);
                    this.details[pos].setAmount(amount);
                    this.totalAmount += amount;
                } else {
                    throw new ProductNotFoundException("Product not found!");
                }
            } catch (ProductNotFoundException err) {
                System.out.println(err.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder detailsString = new StringBuilder("Order details: ");
        for (OrderDetails detail : details) {
            detailsString.append(detail.getProductSKU()).append(" - ").append(detail.getAmount()).append("; ");
        }
        return "Order{" +
                "TransactionID=" + getTransactionID() +
                ", EmployeeID=" + getEmployeeID() +
                ", details=" + detailsString.toString() +
                ", totalAmount=" + totalAmount +
                '}';
    }

    @Override
    public int getEmployeeID() {
        return super.getEmployeeID();
    }

    @Override
    public void setEmployeeID(int EmployeeID) {
        super.setEmployeeID(EmployeeID);
    }

    @Override
    public int getTransactionID() {
        return super.getTransactionID();
    }

    @Override
    public void setTransactionID(int TransactionID) {
        super.setTransactionID(TransactionID);
    }
}

