public class Employee {
    private String name;
    private double ethErgasias;

    public Employee(){}

    public Employee(String name,double ethErgasias) throws InvalidTenureException{
        if(ethErgasias<0||ethErgasias>40) {
           throw new InvalidTenureException("Years of service must be between 0 and 40.");
        }
        this.name=name;
        this.ethErgasias=ethErgasias;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setEthErgasias(double ethErgasias) throws InvalidTenureException {
        if(ethErgasias<0||ethErgasias>40) {
            throw new InvalidTenureException("Years of service must be between 0 and 40.");
        }
        this.ethErgasias = ethErgasias;
    }

    public double getEthErgasias() {
        return ethErgasias;
    }
    
     
}
