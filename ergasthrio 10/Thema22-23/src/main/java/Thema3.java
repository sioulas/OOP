
public class Thema3 {
    public static void main(String[] args){
        int n = 5;
        Employee[] employee = new Employee[n];
        double sum = 0;

    }
    
    public static double averageTenure(Employee[] employee){
        int sum=0;
        for (int i = 0;i < employee.length; i++){
            sum += employee[i].getEthErgasias();
        }
        return sum / employee.length;
    }
}
