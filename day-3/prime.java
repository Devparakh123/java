
import java.util.Scanner;

public class prime {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     boolean ans = isPrime(n);
     System.out.println(ans);
   }
   static boolean isPrime(int n){
             if(n<=1){
                return  false;
             }
           
            for (int c =2 ; c<n ; c++){
                if(n%c == 0 ){
                    return false;
                }
                
            }
        return true ;
   }

}
