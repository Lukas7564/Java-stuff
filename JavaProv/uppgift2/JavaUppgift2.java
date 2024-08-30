
public class JavaUppgift2 {

    public static void main(String args[]) {
        int ary1[] ={5,10,25,75,125};
        int ary2[] = {50,100,250,750,25};
        
        
        float sum1= 0;
        float sum2= 0;
        
        for(int ar1:ary1){
        sum1 += ar1;
        }
        for (int ar2:ary2){
        sum2 += ar2;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum2/sum1);
    }
}
