
import java.util.Scanner;



public class function {
    public static void main(String[] args) {
        dev();
     int ans = sum2();
     System.out.println(ans);
    }

    static void dev(){
        System.out.println("hello world");
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
         System.out.println("enter number one");
         int num1 = in.nextInt();
         System.out.println("enter number two");
         int num2 = in.nextInt();
         int sum = num1+num2;
         return sum;
    }
}
