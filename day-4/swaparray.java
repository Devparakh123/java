
import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8};
        swap(arr ,1 , 2) ;
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int a , int b){
        int temp ;
        temp = arr[a] ;
       arr[a] = arr[b];
       arr[b]= temp ;

       
    }
}
