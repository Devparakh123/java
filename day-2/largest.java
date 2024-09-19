
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 0 ;
       for(int i = 0 ; i<=n ; i++){
          System.out.println("ask for the number");
          Scanner ix = new Scanner(System.in);
           int a = ix.nextInt();
           
           if(a>b){
             b = a ;
           }
        
       }
       System.out.println(b);


    }
}
