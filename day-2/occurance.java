import java.util.Scanner;

public class occurance {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int i = 7 ;
          int a = 0 ;
          for (int s = 0 ; s<=n ; s++){
            Scanner ix = new Scanner(System.in);
            System.out.println("input the value");
            int p = ix.nextInt();
            if(p == i)
              a++;
          }
          System.out.println(a);
       }
}
