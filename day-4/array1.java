import java.util.Scanner;
import java.util.Scanner;



public class array1 {
 public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
     int [] arr = new int[5];

     for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
     }
    //  for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i]);
    //  }
    // for(int num : arr){
    //     System.out.println(num);
    // }
    System.out.println(Arrays.toString(arr));
 }    
}
