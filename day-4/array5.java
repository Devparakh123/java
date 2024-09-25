import java.util.Scanner;
public class array5 {
      public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
              System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
}
}
