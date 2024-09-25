import java.util.Scanner;

public class array3{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
     String [] arr = new String[5];
       for (int index = 0; index < arr.length; index++) {
            arr[index]= in.next();
       }
       for(int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
       }

    }
}