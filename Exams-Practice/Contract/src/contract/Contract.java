
package contract;


public abstract class Contract {
    private String customerName;
    private double budget;

    public Contract() {
    }

    public Contract(String customerName, double budget) {
        this.customerName = customerName;
        this.budget = budget;
    }
    
    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    
}
