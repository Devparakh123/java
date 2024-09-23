

public class function2 {
    public static void main(String[] args) {
       String greets =  greet();
            System.out.println(greets);
            int ans = sum3(10,20);
            System.out.println(ans);
    }

    static String greet(){
        String greeting = "how are you";
        return greeting;
    }
    static int sum3(int a , int b){
        int sum = a+b ;
        return sum;
    }
}
