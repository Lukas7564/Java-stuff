
public class uppgiftArrayloop {

    public static void main(String args[]) {
        int numb[] = {10,20,30,40,50};
        /*
        for(int i = 0;i< numb.length;i++){
            System.out.println(numb[i]);
        }
        System.out.println(numb[0]);
        System.out.println(numb[4]);
*/
        //suman av alla tal
        
        
        int sum = 0;
        for(int nu: numb ){
            sum += nu;
        }
        System.out.println(sum);
        int dif = sum/2;
        System.out.println(dif);

        

        
    }
}
