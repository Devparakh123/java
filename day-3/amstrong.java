
import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         boolean ans = asg(n);
         System.out.println(ans);
    }

    static boolean asg(int n){
        int original = n ;
        int sum  = 0;
        while (n>0) {
            int rem ;
            rem = n%10;
            n = n/10 ;
           
            sum = sum + rem*rem*rem ;
           
        }
        if(sum == original){
            return true;
        }
        return false ;
    }
}
