import java.util.Arrays;

public class maxarray {
    public static void main(String[] args) {
        int[] arr =  {1,2,4,5,6,7,8};
        System.out.println(max(arr));
        int ans = maxrange(arr , 2 ,5);
        System.out.println(ans);
        
           reverse(arr);
              System.out.println(Arrays.toString(arr));
    }
    static int max(int[] arr){
            int ans = arr[0];
           for (int i = 0; i < arr.length; i++) {
               if(arr[i]> ans){
                  ans = arr[i];
               }
           }
           return ans ;
    }

    static int maxrange(int[] arr ,int start , int end){
        int ans = arr[start];
       for (int i = start; i < end; i++) {
           if(arr[i]> ans){
              ans = arr[i];
           }
       }
       return ans ;
}
static void reverse(int[] arr){
   int start = 0 ;
   int end = arr.length-1;
   for (int i = 0; i < arr.length/2; i++) {
       int temp = arr[start+i]  ;
       arr[start+i] = arr[end-i];
       arr[end-i]  = temp ;
   }

     }
   }
