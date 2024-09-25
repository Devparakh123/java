import java.lang.reflect.Array;
import java.util.Arrays;

public class array4 {
    public static void main(String[] args) {
        int []nums = {3,4,5,19};
        System.out.println(Arrays.toString(nums));
             change(nums);
             System.out.println(Arrays.toString(nums));
    }
    static void  change(int []arr){
        arr[0] = 88;
    }
}
