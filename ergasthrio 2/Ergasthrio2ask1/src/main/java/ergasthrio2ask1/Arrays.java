
package ergasthrio2ask1;


public class Arrays {
    public static int findMax(int[] p){
        int temp=0;
        int point = 0;
        for(int i=0;i<p.length;i++){
            if(temp<p[i]){
                temp=p[i];
                point = i;
            }          
        }
        return point;
    }
    
    public static double findAvg(int[] p){
        double sum = 0;
        for(int i=0;i<p.length;i++){
            sum+=p[i];
        }
        double avg=sum/(p.length+1);
        return avg;
    }
    
    public static void display(int[] p){
        for(int i=0;i<p.length;i++){
            System.out.print("Array data: " + p[i] + "\n" );
        }
    }
    
    public static int[] swap(int[] p, int i, int j) {
        int temp;
        temp = p[i];
        p[i] = p[j];
        p[j] = temp;
        return p;
    }
}
